package com.capgemini.start.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.start.api.dto.input.GeneroInputDTO;
import com.capgemini.start.api.dto.input.TipoInputDTO;
import com.capgemini.start.api.dto.output.GeneroDTO;
import com.capgemini.start.api.dto.output.TipoDTO;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Genero", description = "Gênero")
public interface GeneroResource {
	
	@Operation(summary = "Consulta um Gênero por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<GeneroDTO> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os Gêneros")
	@GetMapping()
	ResponseEntity<List<GeneroDTO>> findAll();
	
	@Operation(summary = "Insere um Gênero")
	@PostMapping()
	ResponseEntity<GeneroDTO> insert(@RequestBody @Valid GeneroInputDTO genero);
	
	@Operation(summary = "Atualiza um Genero")
	@PutMapping(value = "/{id}")
	ResponseEntity<GeneroDTO> update(@PathVariable Long id, @RequestBody @Valid GeneroInputDTO tipo);
	
	@Operation(summary = "Exclui um Gênero pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

}
