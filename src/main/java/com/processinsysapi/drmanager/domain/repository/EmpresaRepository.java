package com.processinsysapi.drmanager.domain.repository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.processinsysapi.drmanager.domain.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	 @Query("FROM Empresa e WHERE e.nomeFantasia LIKE :nomeFantasia")
	 List<Empresa> buscarPorNomeFantasia(String nomeFantasia);
	 
	 @Query(value = "from Empresa d where d.dataCadastro BETWEEN :startDate AND :endDate")
	 public List<Empresa> buscarDataCadastro(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
	 	
	 		
}
