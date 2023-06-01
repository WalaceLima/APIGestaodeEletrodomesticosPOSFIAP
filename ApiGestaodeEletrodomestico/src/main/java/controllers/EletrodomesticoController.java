package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dtos.EletrodomesticoPostDto;
import entities.Eletrodomestico;
import interfaces.IEletrodomesticoRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EletrodomesticoController {
	
	@Autowired
	IEletrodomesticoRepository eletrodomesticoRepository;
	
//atributo para armazenar endereço do serviço
	private static final String ENDPOINT="/api/eletrodomesticos";

	//método para cadastrar novo eletrodomestico
	@RequestMapping(value = ENDPOINT, method = RequestMethod.POST)
public ResponseEntity<String> post(@RequestBody EletrodomesticoPostDto dto){
		try {
			Eletrodomestico eletrodomestico =  new Eletrodomestico();
			eletrodomestico.setMarca(dto.getMarca());
			eletrodomestico.setNome(dto.getNome());
			
	//		eletrodomesticoRepository.save(eletrodomestico);
			
			return ResponseEntity.status(HttpStatus.OK)
					.body("Eletrodomestico" + eletrodomestico.getNome() 
					+", cadastrado com Sucesso!");
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Erro: " + e.getMessage());
		}
	
	}
}
