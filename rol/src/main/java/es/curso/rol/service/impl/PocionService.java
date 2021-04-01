package es.curso.rol.service.impl;

import es.curso.rol.model.Pocion;
import es.curso.rol.repository.PocionRepository;
import es.curso.rol.service.IPocionService;
import es.curso.rol.service.dto.PocionDTO;
import es.curso.rol.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PocionService implements IPocionService {

    private PocionRepository pocionRepository;

    public PocionService(PocionRepository pocionRepository) {
        this.pocionRepository = pocionRepository;
    }

    @Override
    public List<PocionDTO> obtenerPociones() {
        List<Pocion> pociones = new ArrayList<Pocion>();
        pociones = this.pocionRepository.findAll();

        return ModelMapperUtils.mapAll(pociones, PocionDTO.class);
    }

    @Override
    public PocionDTO guardar(PocionDTO pocion) {
        Pocion pocionBD = ModelMapperUtils.map(pocion, Pocion.class);
        return ModelMapperUtils.map(this.pocionRepository.save(pocionBD), PocionDTO.class);
    }

    @Override
    public PocionDTO obtenerPocion(Long id) {
        Optional<Pocion> pocion = this.pocionRepository.findById(id);

        if (pocion.isPresent()){
            return ModelMapperUtils.map(pocion.get(), PocionDTO.class);
        } else {
            return null;
        }
    }

    @Override
    public void borrar(Long id) {
        Optional<Pocion> pocion = this.pocionRepository.findById(id);

        if(pocion.isPresent()){
            this.pocionRepository.delete(pocion.get());
        }
    }


    private List<Pocion> inicializarPociones() {
        List<Pocion> pociones = new ArrayList<Pocion>();

        Pocion pocion01 = new Pocion(Long.valueOf(1), "Pocion de maná", "Aporta 20pts de mana", false);
        pociones.add(pocion01);

        Pocion pocion02 = new Pocion(Long.valueOf(2), "Pocion de vida", "Aporta 20pts de vida", false);
        pociones.add(pocion02);

        Pocion pocion03 = new Pocion(Long.valueOf(3), "Pocion de energía", "Aporta 20pts de energía", false);
        pociones.add(pocion03);

        return pociones;
    }
}
