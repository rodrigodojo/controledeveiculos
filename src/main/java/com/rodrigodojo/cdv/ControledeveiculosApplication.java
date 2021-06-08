package com.rodrigodojo.cdv;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigodojo.cdv.domain.Usuario;
import com.rodrigodojo.cdv.repositories.UsuarioRepository;

@SpringBootApplication
public class ControledeveiculosApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControledeveiculosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario users1 = new Usuario(null, "Rodrigo", "Rodrigodoj@gmail.com", "046.087.814.05", "040489");
		Usuario users2 = new Usuario(null, "Jorge", "Jorge@gmail.com", "000.000.814.05", "010489");
		
		usuarioRepository.saveAll(Arrays.asList(users1,users2));
		
	}
	
}
