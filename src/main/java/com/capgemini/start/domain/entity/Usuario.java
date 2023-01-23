package com.capgemini.start.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_usuario")
public class Usuario {
	
	@Id
	@EqualsAndHashCode.Include
	@Column(name="ID_USUARIO", nullable = false)
	private Long id;
	
	@Column(name="NOME_USUARIO", nullable = false)
	private String nome;
	
	@Column(name="EMAIL_USUARIO", nullable = false)
	private String email;
	
}

/*CREATE TABLE TB_USUARIO (
id_usuario integer,
nome_usuario varchar(20),
email_usuario varchar(20)
);*/
