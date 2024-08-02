package dev.anto.supportApp.controllers;


import dev.anto.supportApp.models.Solicitud;
import dev.anto.supportApp.services.SolicitudService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/solicitud")
@CrossOrigin(origins = "https://localhost:5173", allowedHeaders = "*")
public class SolicitudController {

    private SolicitudService solicitudService;

    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }

    @GetMapping(path = "/ver-solicitudes")
    public List<Solicitud> verSolicitudes() {
        return solicitudService.getSolicitudes();
    }

    @PostMapping(path = "/crear-solicitud")
public Solicitud crearSolicitud(@RequestBody Solicitud solicitud) {
    return solicitudService.crearSolicitud(solicitud);
}

    @GetMapping("/obtener/{idSolicitud}")
    public Solicitud obtenerSolicitud(@PathVariable Long idSolicitud) {
        return solicitudService.obtenerSolicitud(idSolicitud);
    }

    @PutMapping("/actualizar/{idSolicitud}")
    public Solicitud updateConsult(@RequestBody Solicitud solicitud, @PathVariable Long idSolicitud) {
        solicitud.setId(idSolicitud);
        return solicitudService.actualizarSolicitud(solicitud);
    } 

     @DeleteMapping("/borrar/{idSolicitud}")
    public void borrarSolicitud(@PathVariable Long idSolicitud) {
        borrarSolicitud(idSolicitud);
    }
}

