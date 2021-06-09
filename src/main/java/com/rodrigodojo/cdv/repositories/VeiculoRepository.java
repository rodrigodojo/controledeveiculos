package com.rodrigodojo.cdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigodojo.cdv.domain.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Integer> {

}
