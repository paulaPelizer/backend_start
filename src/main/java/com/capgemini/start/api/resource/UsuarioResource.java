package com.capgemini.start.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.capgemini.start.api.dto.input.UsuarioInputDTO;
import com.capgemini.start.api.dto.output.UsuarioDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Usuario", description = "Usuários do Sistema")
public interface UsuarioResource {
	
	@Operation(summary = "Consulta um Usuário por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<UsuarioDTO> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os usuários")
	@GetMapping()
	ResponseEntity<List<UsuarioDTO>> findAll();
	
	@Operation(summary = "Insere um usuário")
	@PostMapping()
	ResponseEntity<UsuarioDTO> insert(@Valid UsuarioInputDTO usuario);
	
	@Operation(summary = "Atualiza um usuário")
	@PutMapping(value = "/{id}")
	ResponseEntity<UsuarioDTO> update(Long id, @Valid UsuarioInputDTO usuario);
	
	@Operation(summary = "Exclui um usuário pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

	
	
	
	

}
