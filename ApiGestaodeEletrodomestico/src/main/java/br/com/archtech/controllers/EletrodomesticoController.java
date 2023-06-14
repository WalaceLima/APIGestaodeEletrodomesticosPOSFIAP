package br.com.archtech.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.archtech.dtos.EletrodomesticoPostDto;
import br.com.archtech.dtos.EletrodomesticoResponseDTO;
import br.com.archtech.services.EletrodomesticoAppService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EletrodomesticoController {
	

	private final EletrodomesticoAppService eletrodomesticoAppService;

	
	@PostMapping("/eletrodomesticos")
public ResponseEntity<EletrodomesticoResponseDTO> post(@Validated @RequestBody EletrodomesticoPostDto dto){
		try {
			EletrodomesticoResponseDTO response
			=eletrodomesticoAppService.criarEletrodomestico(dto);
			
			return ResponseEntity
					.status(HttpStatus.CREATED)
					.body(response);
		} catch (Exception e) {
			
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(null) ;

		}	
	}
}
