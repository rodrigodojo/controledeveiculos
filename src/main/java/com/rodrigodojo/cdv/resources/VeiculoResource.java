package com.rodrigodojo.cdv.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigodojo.cdv.domain.Veiculo;


@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public List<Veiculo> find() {
		
		Veiculo users1 = new Veiculo();
		Veiculo users2 = new Veiculo();
		
		List<Veiculo> lista = new ArrayList<>();
		lista.add(users1);
		lista.add(users2);
		
		
		return lista;
	}
	

}
