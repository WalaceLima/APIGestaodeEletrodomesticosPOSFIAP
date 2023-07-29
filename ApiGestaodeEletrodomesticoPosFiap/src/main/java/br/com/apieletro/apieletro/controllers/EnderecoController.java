package br.com.apieletro.apieletro.controllers;

import br.com.apieletro.apieletro.dtos.EnderecoDto;
import br.com.apieletro.apieletro.models.Endereco;
import br.com.apieletro.apieletro.models.interfaces.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<Endereco> criar(@Valid @RequestBody EnderecoDto enderecoDto, HttpServletResponse response) {
		Endereco enderecoSalvo = enderecoRepository.save(enderecoDto.toEntity(enderecoDto));
		publisher.publishEvent(new br.com.archtech.event.RecursoCriadoEvent(this, response, enderecoSalvo.getCodigo()));
			return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
	}
}
