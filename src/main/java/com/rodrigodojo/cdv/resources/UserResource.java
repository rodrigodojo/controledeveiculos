package com.rodrigodojo.cdv.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigodojo.cdv.domain.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UserResource {
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> listar() {
		
		Usuario users1 = new Usuario(1, "Rodrigo", "Rodrigodoj@gmail.com", "1234567899", 04/04/1989);
		Usuario users2 = new Usuario(2, "jorge", "Rodrigodoj2@gmail.com", "1234567889", 04/04/1989);
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(users1);
		lista.add(users2);
		
		
		return lista;
	}

}
