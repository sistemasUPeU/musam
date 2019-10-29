package com.musam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musam.entity.Usuario;
@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
