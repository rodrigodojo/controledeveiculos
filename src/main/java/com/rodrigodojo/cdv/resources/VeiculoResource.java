package com.rodrigodojo.cdv.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rodrigodojo.cdv.domain.Veiculo;
import com.rodrigodojo.cdv.services.VeiculoService;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll(){
		List<Veiculo> list = service.findAll();
		return ResponseEntity.ok().body(list);		
	} 
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Veiculo obj = service.find(id);
		return ResponseEntity.ok().body(obj);
			
	}
	
	@PostMapping
	public ResponseEntity<Veiculo> insert(@RequestBody Veiculo obj){
		obj = service.insert(obj);
		service.situacaoRodizio(obj.getId());
		//service.valorVeiculo(obj.getId());
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Veiculo> update(@PathVariable Integer id,@RequestBody Veiculo obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);	
	}
	
}
