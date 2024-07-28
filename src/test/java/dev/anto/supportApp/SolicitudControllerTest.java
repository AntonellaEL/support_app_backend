package dev.anto.supportApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.anto.supportApp.controllers.SolicitudController;
import dev.anto.supportApp.models.Solicitud;
import dev.anto.supportApp.services.SolicitudService;

@SpringBootTest
public class SolicitudControllerTest {

    @Autowired
    private SolicitudController solicitudController;

    @Autowired
    private SolicitudService solicitudService;

    @Test
    void verSolicitudesTest() {
        List<Solicitud> solicitudes = solicitudController.verSolicitudes();
        assertNotNull(solicitudes);
    }

    @Test
    void crearSolicitudTest() {
        Solicitud nuevaSolicitud = new Solicitud();
        Solicitud solicitudCreada = solicitudController.crearSolicitud(nuevaSolicitud);
        assertNotNull(solicitudCreada);
        assertEquals(nuevaSolicitud, solicitudCreada);
    }


    @Test
    void updateConsultTest() {
        Solicitud nuevaSolicitud = new Solicitud();
        Solicitud solicitudCreada = solicitudService.crearSolicitud(nuevaSolicitud);

        Solicitud solicitudActualizada = new Solicitud();
        solicitudActualizada.setId(solicitudCreada.getId());
        Solicitud solicitudResultante = solicitudController.updateConsult(solicitudActualizada, solicitudCreada.getId());
        
        assertNotNull(solicitudResultante);
        assertEquals(solicitudActualizada.getId(), solicitudResultante.getId());

    }
}
