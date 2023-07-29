package br.com.archtech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eletrodomestico {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idEndereco;
	private String nome;
	private String marca;
	private String tensao;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	
	public Eletrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Eletrodomestico(Integer idEndereco, String nome, String marca, String tensao, String rua, Integer numero,
			String bairro, String cidade, String estado) {
		super();
		this.idEndereco = idEndereco;
		this.nome = nome;
		this.marca = marca;
		this.tensao = tensao;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public Integer getIdEndereco() {
		return idEndereco;
	}


	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTensao() {
		return tensao;
	}


	public void setTensao(String tensao) {
		this.tensao = tensao;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
