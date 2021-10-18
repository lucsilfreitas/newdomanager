package com.processinsysapi.drmanager.domain.service;

import java.util.List;

import com.processinsysapi.drmanager.domain.model.Filial;

public interface FilialService {

	Filial findbyId(Long id);

	List<Filial> findAll();

	Filial save(Filial filiais);

	void delete(Long id);

	Filial update(Filial filiais, Long id);
}
