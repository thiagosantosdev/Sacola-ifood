package me.dio.sacola.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Produto>cardapio;
	@Embedded
	private Endereco endereco;
	
	
	
	public Restaurante() {
		
	}
	
	
	public Restaurante(Long id, String nome, List<Produto> cardapio, Endereco endereco) {
		
		this.id = id;
		this.nome = nome;
		this.cardapio = cardapio;
		this.endereco = endereco;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getCardapio() {
		return cardapio;
	}
	public void setCardapio(List<Produto> cardapio) {
		this.cardapio = cardapio;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
