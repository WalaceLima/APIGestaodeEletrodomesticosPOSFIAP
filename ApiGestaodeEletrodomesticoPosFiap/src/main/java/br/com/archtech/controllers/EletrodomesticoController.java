package br.com.archtech.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.archtech.dtos.EletrodomesticoDto;
import br.com.archtech.dtos.EletrodomesticoResponseDto;
import br.com.archtech.repositories.EletrodomesticoRepository;
import br.com.archtech.services.EletrodomesticoAppService;
import jakarta.validation.Valid;

@RestController
public class EletrodomesticoController {
	@Autowired
	EletrodomesticoRepository eletrodomesticoRepository;
	@Autowired
	EletrodomesticoAppService service; 
	
	private static final String ENDPOINT="/api";
	
	@RequestMapping(value = ENDPOINT,method = RequestMethod.GET)
    public String get() {
      return "Deu Certo!";
       
    }
	
	@RequestMapping(value = ENDPOINT,method = RequestMethod.POST)
	public ResponseEntity<EletrodomesticoResponseDto> post(@Valid @RequestBody EletrodomesticoDto dto){
	try {
		EletrodomesticoResponseDto response= service.criarEletro(dto);	
			
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(response);	
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
