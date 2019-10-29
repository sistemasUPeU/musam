package com.musam;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.musam.entity.Usuario;
import com.musam.repository.UsuarioRepository;

@SpringBootTest
class MusamApplicationTests {
	@Autowired
	private UsuarioRepository repository;

	@Test
	void guadarUsuario() {
		Usuario us = new Usuario();
		us.setUser("jonas");
		us.setClave("12345");
		repository.save(us);

	}

}
