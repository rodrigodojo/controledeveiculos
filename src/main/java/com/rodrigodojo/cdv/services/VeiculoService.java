package com.rodrigodojo.cdv.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigodojo.cdv.domain.Veiculo;
import com.rodrigodojo.cdv.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repo;
	
	public List<Veiculo> findAll(){
		return repo.findAll();
	}
	
	public Veiculo find(Integer id){
		Optional<Veiculo> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	
	public Veiculo insert(Veiculo obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public Veiculo update(Integer id,Veiculo obj) {
		Veiculo entity = repo.getOne(id);
		updateData(entity,obj);
		return repo.save(entity);
	}

	private void updateData(Veiculo entity, Veiculo obj) {
		entity.setMarca(obj.getMarca());
		entity.setModelo(obj.getModelo());
		entity.setAno(obj.getAno());
		entity.setRodizio(obj.getRodizio());
		
	}

	//Separando a String do ano para descobrir qual a situaçao do ano a partir do ano do veiculo.
	public void situacaoRodizio(Integer id) {
		Veiculo obj = repo.getOne(id);
		String temp;
		temp = (obj.getAno().substring(3,3));
		if(temp == "0" || temp == "1") {
			obj.setRodizio(true);
			
		}else if(temp == "2" || temp == "3") {
			obj.setRodizio(true);
			
		}else if(temp == "4" || temp == "5") {
			obj.setRodizio(true);
			
		}else if(temp == "6" || temp == "7") {
			obj.setRodizio(true);
			
		}else if(temp == "8" || temp == "9") {
			obj.setRodizio(true);
			
		}else {
			obj.setRodizio(false);	
		}
	}

}
