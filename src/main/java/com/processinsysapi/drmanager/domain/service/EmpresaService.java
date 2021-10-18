package com.processinsysapi.drmanager.domain.service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import com.processinsysapi.drmanager.domain.model.Empresa;

public interface EmpresaService {
	
	Empresa findbyId(Long id);

	List<Empresa> findAll();

	Empresa save(Empresa empresas);

	void delete(Long id);

	Empresa update(Empresa empresas, Long id);
	
	List<Empresa> buscarPorNomeFantasia(String nomeFantasia);
	
	List<Empresa> buscarDataCadastro(Date dataCadastro);

	List<Empresa> buscarDataCadastro(LocalDateTime startDate, LocalDateTime endDate);

}
