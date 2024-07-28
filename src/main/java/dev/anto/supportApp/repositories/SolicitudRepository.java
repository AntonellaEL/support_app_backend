package dev.anto.supportApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.anto.supportApp.models.Solicitud;


public interface SolicitudRepository extends JpaRepository<Solicitud, Long>{

    List<Solicitud> findAllByOrderByDateDesc();

}
