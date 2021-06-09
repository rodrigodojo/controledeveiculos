package com.rodrigodojo.cdv;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigodojo.cdv.domain.Usuario;
import com.rodrigodojo.cdv.domain.Veiculo;
import com.rodrigodojo.cdv.repositories.UsuarioRepository;
import com.rodrigodojo.cdv.repositories.VeiculoRepository;

@SpringBootApplication
public class ControledeveiculosApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	private VeiculoRepository veiculoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControledeveiculosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario users1 = new Usuario(null, "Rodrigo", "Rodrigodoj@gmail.com", "046.087.814.05", "040489");
		Usuario users2 = new Usuario(null, "Jorge", "Jorge@gmail.com", "000.000.814.05", "010489");
		
		Veiculo cars1 = new Veiculo(null, "Ford", "Escort", "2002");
		Veiculo cars2 = new Veiculo(null, "Mitsubishi", "Lancer",  "2013");
		Veiculo cars3 = new Veiculo(null, "Fiat", "Palio",  "2018");
		
		//users1.getVeiculos().addAll(Arrays.asList(cars1,cars2,cars3));
		//users2.getVeiculos().addAll(Arrays.asList(cars3));
		
		//cars1.getUsuarios().addAll(Arrays.asList(users1));
		//cars2.getUsuarios().addAll(Arrays.asList(users1));
		//cars3.getUsuarios().addAll(Arrays.asList(users1,users2));
		
		usuarioRepository.saveAll(Arrays.asList(users1,users2));
		veiculoRepository.saveAll(Arrays.asList(cars1,cars2,cars3));
		
	}
	
}
