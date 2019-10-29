package com.musam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musam.entity.Usuario;
import com.musam.repository.UsuarioRepository;

@Service
public class UsuarioService {
@Autowired
private UsuarioRepository repository;
public List<Usuario> findAll() {
    return repository.findAll();
}

public Optional<Usuario> findById(Long id) {
    return repository.findById(id);
}

public Usuario save(Usuario user) {
    return repository.save(user);
}

public void deleteById(Long id) {
    repository.deleteById(id);
}
}
