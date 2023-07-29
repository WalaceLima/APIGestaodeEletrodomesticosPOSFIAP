package br.com.apieletro.apieletro.controllers;

import br.com.apieletro.apieletro.models.Eletrodomestico;
import br.com.apieletro.apieletro.models.interfaces.EletrodomesticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RestController
@RequestMapping(path = "/eletrodomesticos", produces = MediaType.APPLICATION_JSON_VALUE)
public class EletrodomesticoController {
    @Autowired
    EletrodomesticoRepository eletrodomesticoRepository;

    @GetMapping
    public List<Eletrodomestico> listarEletrodomesticos(){
        return eletrodomesticoRepository.findAll();
        }
    @GetMapping("/{id}")
    public Eletrodomestico buscarEletrodomesticos(@PathVariable("id")Long id){
        return eletrodomesticoRepository.findById(id).get();
    }

    @PostMapping
    public Eletrodomestico criarEletrodomestico(@RequestBody Eletrodomestico eletrodomestico){
        return eletrodomesticoRepository.save(eletrodomestico);
    }
    //ToDo
    @PutMapping("/{id}")
    public Eletrodomestico atualizarEletrodomestico(@PathVariable("id")Long id,@RequestBody Eletrodomestico eletrodomestico){
        Eletrodomestico atualizarEletro= buscarEletrodomesticos(id);
        atualizarEletro.setMarca(eletrodomestico.getMarca());
        atualizarEletro.setNome(eletrodomestico.getNome());
        atualizarEletro.setTensao(eletrodomestico.getTensao());
        return eletrodomesticoRepository.save(atualizarEletro);
    }
    //ToDo
    @PatchMapping ("/{id}")
    public Eletrodomestico incrementarEletrodomestico(@PathVariable("id")Long id,@RequestBody Eletrodomestico eletrodomestico){
        Eletrodomestico incrementarEletro= buscarEletrodomesticos(id);
        incrementarEletro.setMarca(Optional.ofNullable(eletrodomestico.getMarca()).orElse(incrementarEletro.getMarca()));
        incrementarEletro.setNome(Optional.ofNullable(eletrodomestico.getNome()).orElse(incrementarEletro.getNome()));
        incrementarEletro.setTensao(Optional.ofNullable(eletrodomestico.getTensao()).orElse(incrementarEletro.getTensao()));
        return eletrodomesticoRepository.save(incrementarEletro);
    }
    @DeleteMapping ("/{id}")
    public void apagarEletrodomestico(@PathVariable("id")Long id){
        eletrodomesticoRepository.deleteById(id);
    }
}
