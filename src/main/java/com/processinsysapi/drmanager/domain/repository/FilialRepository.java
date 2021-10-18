package com.processinsysapi.drmanager.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.processinsysapi.drmanager.domain.model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {

		
}
