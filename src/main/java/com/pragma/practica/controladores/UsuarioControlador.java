package com.pragma.practica.controladores;

import com.pragma.practica.modelo.Usuario;
import com.pragma.practica.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioServicio.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable(value = "id") long id) {
        Optional<Usuario> usuario = usuarioServicio.buscarPorId(id);

        return usuario.map(value -> ResponseEntity.ok().body(value))
          .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Usuario guardarUsuario(@Validated @RequestBody Usuario usuario) {
        return usuarioServicio.guardar(usuario);
    }
}
