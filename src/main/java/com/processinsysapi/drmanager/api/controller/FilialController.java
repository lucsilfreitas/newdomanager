package com.processinsysapi.drmanager.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.processinsysapi.drmanager.domain.model.Filial;
import com.processinsysapi.drmanager.domain.service.FilialService;





@RestController
@RequestMapping("/filiais")
public class FilialController {
	
	
	@Autowired
	private FilialService filiaisService;
	
	@GetMapping("{id}")
	public Filial buscaPorId(@PathVariable Long id) {
		return filiaisService.findbyId(id);
	}
	
	@GetMapping
	public List<Filial> list(){
		return filiaisService.findAll();
	}
	
	@PostMapping
	public Filial save(@RequestBody Filial filiais) {
		return filiaisService.save(filiais);
	}
	
	
	@PutMapping("{id}")
	public Filial update(@RequestBody  Filial filiais, @PathVariable Long id) {
		return filiaisService.update(filiais, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		filiaisService.delete(id);
	}
	
	
	
/*	@Autowired
	private EmpresaRepository empresaRepository;
	
	//@GetMapping
	//public List<Empresa> listar(){
	//	return empresaRepository.findAll();
		
	//}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Empresa>> listaEmpresa(){
		List<Empresa>  empresas = empresaRepository.findAll();
		return new ResponseEntity<List<Empresa>>(empresas, HttpStatus.OK);
	}
	
	

	@GetMapping("/{id}")
	public Optional<Empresa> buscarPeloCodigo(@PathVariable Long id) {
		return empresaRepository.findById(id);
	}
	
	
	@PostMapping( value = "salvar")	
	@ResponseBody
	public ResponseEntity<Empresa> salvar(@RequestBody Empresa empresa){
		Empresa empresas = empresaRepository.save(empresa);
		
		return new ResponseEntity<Empresa>(empresas, HttpStatus.CREATED);
		
	}
	
	@PutMapping( value = "atualizar")	
	@ResponseBody
	public ResponseEntity<Empresa> atualizar(@RequestBody Empresa empresa){
		Empresa empresas = empresaRepository.saveAndFlush(empresa);
		
		return new ResponseEntity<Empresa>(empresas, HttpStatus.OK);
		
	}
	
		
	
	@DeleteMapping( value = "delete")	
	@ResponseBody
	public ResponseEntity<Empresa> delete(@RequestParam Long id){
		empresaRepository.deleteById(id);
		
		return new ResponseEntity<Empresa>(HttpStatus.OK);
		
	}
	
	
	@GetMapping( value = "buscaruserid")	
	@ResponseBody
	public ResponseEntity<Empresa> buscarUserId(@RequestParam(name = "id") Long id){
		Empresa empresas = empresaRepository.findById(id).get();
		
		return new ResponseEntity<Empresa>(empresas, HttpStatus.OK);
		
	}
	
	
	
	
/*	@DeleteMapping("/empresas/{id}")
	public void deleteEmpresa(@PathVariable Long id) {
		empresaRepository.deleteById(id);
	}*/
	

	
}
