package com.musam.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musam.entity.Usuario;
import com.musam.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class HomeController {
	@Autowired
	private UsuarioService service;
	
	@PostMapping("/add")
	public Usuario addUsuario(@RequestBody Usuario user) {
		return service.save(user);
	}

	@GetMapping("/all")
	public Iterable<Usuario> allUser() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Usuario> countryById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@PutMapping("/update")
	public Usuario updateCountry(@RequestBody Usuario user) {
		return service.save(user);
	}

	@DeleteMapping("/{id}")
	public void deleteCountry(@PathVariable("idd") Long id ){
         service.deleteById(id);
	}
   
}
