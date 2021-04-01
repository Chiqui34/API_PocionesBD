package es.curso.rol.service.dto;

import lombok.Data;

@Data
public class PocionDTO {
    private Long id;
    private String titulo;
    private String descripcion;
    private Boolean esEpica;

    public PocionDTO() {
    }

    public PocionDTO(Long id, String titulo, String descripcion, Boolean esEpica) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.esEpica = esEpica;
    }
}
