package com.rodrigodojo.cdv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigodojo.cdv.domain.Usuario;
import com.rodrigodojo.cdv.repositories.UsuarioRepository;
import com.rodrigodojo.cdv.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario find(Integer id){
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));		
	}
	
	public Usuario insert(Usuario obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public Usuario update(Integer id,Usuario obj) {
		Usuario entity = repo.getOne(id);
		updateData(entity,obj);
		return repo.save(entity);
	}

	private void updateData(Usuario entity, Usuario obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setCPF(obj.getCPF());
		entity.setDataDeNascimento(obj.getDataDeNascimento());
	}
}
