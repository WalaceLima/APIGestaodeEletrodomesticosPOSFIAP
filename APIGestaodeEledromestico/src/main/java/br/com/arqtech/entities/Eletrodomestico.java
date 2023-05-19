package br.com.arqtech.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor@EntityScan
public class Eletrodomestico {
	
	private String nome;
	private String modelo;
	private Integer potencia;

}
