package com.processinsysapi.drmanager.domain.service.impl;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processinsysapi.drmanager.domain.model.Empresa;
import com.processinsysapi.drmanager.domain.repository.EmpresaRepository;
import com.processinsysapi.drmanager.domain.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaRepository empresasRepository;
	
	@Override
	public Empresa findbyId(Long id) {
		
		Optional<Empresa> empresaOptional = empresasRepository.findById(id);
		
		Empresa empresas = null;
		
		if (empresaOptional.isPresent()) {
			empresas = empresaOptional.get();
		}
		return empresas;
	}

	@Override
	public List<Empresa> findAll() {
		
		return empresasRepository.findAll();
	}

	@Override
	public Empresa save(Empresa empresa) {
		
		return empresasRepository.save(empresa);
	}

	@Override
	public void delete(Long id) {
		empresasRepository.deleteById(id);
		
	}

	@Override
	public Empresa update(Empresa empresas, Long id) {
				
		Empresa empresaUpdate = findbyId(id);
		
		if (empresaUpdate != null) {
			empresas.setId(id);
			return empresasRepository.save(empresas);
		}
		
		return null;
	}

	@Override
	public List<Empresa> buscarPorNomeFantasia(String nomeFantasia) {
				
		return empresasRepository.buscarPorNomeFantasia("%"+nomeFantasia+"%");
	}

	@Override
	public List<Empresa> buscarDataCadastro(Date dataCadastro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> buscarDataCadastro(LocalDateTime startDate, LocalDateTime endDate) {
		
		return empresasRepository.buscarDataCadastro(startDate, endDate);
	}


	
	
}
