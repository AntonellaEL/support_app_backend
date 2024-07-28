package dev.anto.supportApp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.anto.supportApp.models.Solicitud;

import dev.anto.supportApp.repositories.SolicitudRepository;

@Service
public class SolicitudService {

    private SolicitudRepository repository;

    public SolicitudService(SolicitudRepository repository) {
        this.repository = repository;
    }

    public List <Solicitud> getSolicitudes() {
        return repository.findAllByOrderByDateDesc();
    }

    public Solicitud crearSolicitud(Solicitud solicitud) {
        return repository.save(solicitud);
    }

    public Solicitud obtenerSolicitud(Long id) {
        return repository.findById(id).orElse(null);
    }
    
    public Solicitud actualizarSolicitud(Solicitud solicitud) {
        return repository.save(solicitud);
    }

    public void borrarSolicitud(Long id) {
        repository.deleteById(id);
    }
}
