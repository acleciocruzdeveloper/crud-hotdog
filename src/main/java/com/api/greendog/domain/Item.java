package com.api.greendog.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Length(min = 2, max = 30, message = "O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nome;

	@NotNull
	@Min(value = 20, message = "O valor mínimo deve ser {value} reais")
	private Double preco;

	public Item(Long id,String nome,Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Item() {
	}



	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
