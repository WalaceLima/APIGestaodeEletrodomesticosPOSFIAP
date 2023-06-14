package br.com.archtech.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EletrodomesticoPostDto {
	
	@Size(min = 2, max = 50, message = "Nome do aparelho deve ter entre 2 e 50 caracteres.")
	@NotBlank(message = "Nome do aparelho é obrigatório.")
	private String nome;
	
	@NotBlank(message = "Nome do aparelho é obrigatório.")
	private String marca;
}
