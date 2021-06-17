package com.rodrigodojo.cdv.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.rodrigodojo.cdv.domain.FIPE;
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
		situacaoRodizioMelhor(obj);
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
	
	public void situacaoRodizioMelhor(Veiculo obj) {
		String temp = "";
		temp = (obj.getAno().substring(3,4));
		if(temp == "0" || temp == "1") {
			obj.setRodizio(true);
			obj.setDia("segunda-feira");

		}else if(temp == "2" || temp == "3") {
			obj.setRodizio(true);
			obj.setDia("terça-feira");

		}else if(temp == "4" || temp == "5") {
			obj.setRodizio(true);
			obj.setDia("quarta-feira");

		}else if(temp == "6" || temp == "7") {
			obj.setRodizio(true);
			obj.setDia("quinta-feira");

		}else if(temp == "8" || temp == "9") {
			obj.setRodizio(true);
			obj.setDia("sexta-feira");

		}else {
			obj.setDia("Rodizio não autorizado");
			obj.setRodizio(false);	
		}
	}
	
	public void valorVeiculo(Integer id){
		Veiculo obj = repo.getOne(id);
		int cont =0;
		Integer marca=0;
		String temp="";
		
		RestTemplate restTemplate = new RestTemplate();
		FIPE objTemp = restTemplate.getForObject("https://parallelum.com.br/fipe/api/v1/carros/marcas",FIPE.class);
		
		do {
			if(objTemp.getMarca().equals(obj.getMarca())) {
				temp = obj.getMarca();
				marca =Integer.parseInt(temp);
				cont+=1;
			}else {
				cont=0;
			}
		}while(cont != 1);
		
		
		Veiculo consulta = restTemplate.getForObject("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/5940/anos/"+obj.getAno(), Veiculo.class);
	}
	
	public void valorVeiculoMelhor(Integer id){
		Veiculo obj = repo.getOne(id);
		int cont =0;
		Integer marca=0;
		String temp="";
		
		UriComponents uri = UriComponentsBuilder.newInstance().scheme("https").host("parallelum.com.br").path("fipe/api/v1").queryParam("marcas","carros").build();
		
		RestTemplate restTemplate = new RestTemplate();
		FIPE objTemp = restTemplate.getForObject(uri.toUriString(),FIPE.class);
		
		do {
			if(objTemp.getMarca().equals(obj.getMarca())) {
				temp = obj.getMarca();
				marca =Integer.parseInt(temp);
				cont+=1;
			}else {
				cont=0;
			}
		}while(cont != 1);
		
		
	}

}
