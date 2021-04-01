package es.curso.rol.resource;

import es.curso.rol.model.Pocion;
import es.curso.rol.service.IPocionService;
import es.curso.rol.service.dto.PocionDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PocionResource {

    private IPocionService pocionService;

    public PocionResource(IPocionService pocionService) {
        this.pocionService = pocionService;
    }

    @GetMapping("/pociones")
    public List<PocionDTO> getAllPociones() {
        List<PocionDTO> pociones = new ArrayList<PocionDTO>();
        pociones = this.pocionService.obtenerPociones();
        return pociones;
    }

    @PostMapping("/pociones")
    public PocionDTO crearPocion(@RequestBody PocionDTO pocion){
        PocionDTO resultado;
        resultado = this.pocionService.guardar(pocion);
        return resultado;
    }

    @PutMapping("/pociones")
    public PocionDTO modificarPocion(@RequestBody PocionDTO pocion){
        PocionDTO resultado;
        resultado = this.pocionService.guardar(pocion);
        return resultado;
    }

    @GetMapping("/pociones/{id}")
    public PocionDTO obtenerPocion(@PathVariable Long id){
        return this.pocionService.obtenerPocion(id);
    }

    @DeleteMapping("/pociones/{id}")
    public void borrarPocion(@PathVariable Long id){
        this.pocionService.borrar(id);
    }




}
