package dev.anto.supportApp.controllers;

import java.util.List;

import dev.anto.supportApp.models.Usuario;
import dev.anto.supportApp.services.UsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private UsuarioService services;

    public UsuarioController(UsuarioService services) {
        this.services = services;
    }

    @GetMapping(path = "/usuarios")
    public List<Usuario> index() {

        return services.getAll();

    }

}