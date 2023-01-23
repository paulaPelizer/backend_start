package com.capgemini.start.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.capgemini.start.api.dto.input.GeneroInputDTO;
import com.capgemini.start.api.dto.input.TipoInputDTO;
import com.capgemini.start.api.dto.output.GeneroDTO;
import com.capgemini.start.api.dto.output.TipoDTO;
import com.capgemini.start.domain.entity.Genero;
import com.capgemini.start.domain.entity.Tipo;

@Component
@Mapper(componentModel = "spring")
public interface GeneroMapper {

	GeneroDTO toDTO(Genero genero);

	@Mapping(target = "id", ignore = true)
	Genero toEntity(GeneroInputDTO genero);

}