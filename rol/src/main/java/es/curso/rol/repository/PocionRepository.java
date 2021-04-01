package es.curso.rol.repository;

import es.curso.rol.model.Pocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PocionRepository extends JpaRepository<Pocion, Long> {
}
