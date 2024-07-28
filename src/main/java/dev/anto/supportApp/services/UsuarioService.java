package dev.anto.supportApp.services;

import java.util.List;

import dev.anto.supportApp.models.Usuario;
import dev.anto.supportApp.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

   private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> getAll() {
        List<Usuario> usuarios = repository.findAll();
        return usuarios;
    }

}