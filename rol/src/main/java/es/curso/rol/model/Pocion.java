package es.curso.rol.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pocion")
public class Pocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "es_epica")
    private Boolean esEpica;

    public Pocion() {
    }

    public Pocion(Long id, String titulo, String descripcion, Boolean esEpica) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.esEpica = esEpica;
    }
}
