package com.rodrigodojo.cdv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigodojo.cdv.domain.Veiculo;
import com.rodrigodojo.cdv.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repo;
	
	public Veiculo find(Integer id){
		Optional<Veiculo> obj = repo.findById(id);
		return obj.orElse(null);		
	}

	public void situacaoRodizio(Integer id) {
		Veiculo obj = repo.getOne(id);
		//criar a funcao do rodizio
		
	}

}
