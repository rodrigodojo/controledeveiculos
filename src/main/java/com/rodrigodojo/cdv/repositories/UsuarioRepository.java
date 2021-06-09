package com.rodrigodojo.cdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigodojo.cdv.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	
}
