package com.rodrigodojo.cdv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigodojo.cdv.domain.Usuario;
import com.rodrigodojo.cdv.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario buscar(Integer id){
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElse(null);		
	}
}
