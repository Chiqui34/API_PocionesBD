package es.curso.rol.service;


import es.curso.rol.service.dto.PocionDTO;

import java.util.List;

public interface IPocionService {
    public List<PocionDTO> obtenerPociones();

    PocionDTO guardar(PocionDTO pocion);

    PocionDTO obtenerPocion(Long id);

    void borrar(Long id);
}
