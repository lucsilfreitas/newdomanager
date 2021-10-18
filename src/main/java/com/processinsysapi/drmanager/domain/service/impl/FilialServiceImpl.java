package com.processinsysapi.drmanager.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processinsysapi.drmanager.domain.model.Filial;
import com.processinsysapi.drmanager.domain.repository.FilialRepository;
import com.processinsysapi.drmanager.domain.service.FilialService;

@Service
public class FilialServiceImpl implements FilialService {

	@Autowired
	private FilialRepository filiaisRepository;
	
	@Override
	public Filial findbyId(Long id) {
		
		Optional<Filial> filialOptional = filiaisRepository.findById(id);
		
		Filial filiais = null;
		
		if (filialOptional.isPresent()) {
			filiais = filialOptional.get();
		}
		return filiais;
	}

	@Override
	public List<Filial> findAll() {
		
		return filiaisRepository.findAll();
	}

	@Override
	public Filial save(Filial filiais) {
		
		return filiaisRepository.save(filiais);
	}

	@Override
	public void delete(Long id) {
		filiaisRepository.deleteById(id);
		
	}

	@Override
	public Filial update(Filial filiais, Long id) {
				
		Filial filialUpdate = findbyId(id);
		
		if (filialUpdate != null) {
			filiais.setId(id);
			return filiaisRepository.save(filiais);
		}
		
		return null;
	}
}
