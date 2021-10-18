package com.processinsysapi.drmanager.api.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.processinsysapi.drmanager.domain.model.Empresa;
import com.processinsysapi.drmanager.domain.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	
	
	@Autowired
	private EmpresaService empresasService;
	

	@GetMapping("{id}")
	public Empresa buscaPorId(@PathVariable Long id) {
		return empresasService.findbyId(id);
	}
	
	@GetMapping
	public List<Empresa> list(){
		return empresasService.findAll();
	}
	
	@PostMapping
	public Empresa save(@RequestBody Empresa empresas) {
		return empresasService.save(empresas);
	}
	
	
	@PutMapping("{id}")
	public Empresa update(@RequestBody  Empresa empresas, @PathVariable Long id) {
		return empresasService.update(empresas, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		empresasService.delete(id);
	}
	
	
	@GetMapping("/nomefantasia/{nomeFantasia}")
	public List<Empresa> buscarPorNomeFantasia(@PathVariable String nomeFantasia) {
		
		return empresasService.buscarPorNomeFantasia(nomeFantasia);
	}
	
	@GetMapping("/filtrar/dataCadastro/")
	public List<Empresa> buscarDataCadastro(@RequestParam String startDate, @RequestParam String endDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime parsedStartDate = LocalDateTime.parse(startDate+" 00:00", formatter);
		LocalDateTime parsedEndDate = LocalDateTime.parse(endDate+" 23:59", formatter);
		return empresasService.buscarDataCadastro(parsedStartDate, parsedEndDate);
	}
	

	
}
