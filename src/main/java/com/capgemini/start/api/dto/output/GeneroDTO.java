package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "Genero", description = "Objeto de saída da entidade Gênero")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneroDTO {
	
	private Long id;
	private String descricao;
	private LocalDateTime data1;
	private LocalDateTime data2;

}