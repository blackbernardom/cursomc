package com.bernardo.cursomc.domain;

import java.io.Serializable;

//Classe implementada com serializable, e boa e importante para deixar vizivel, conversao de bites, transferencia de arquivos e de rede
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	//criando variaveis
	private Integer id;
	private String nome;
	
	//criando os construtores das variaveis vazio
	
	public Categoria() {
		
	}
	// criando construtores para povoar as variaveis

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	
	//fazendo os metodos de acessos para atributos
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//hashCode Equals serve para fazer comparacao do conteudo da variavel e nao do seu ponteiro na memoria 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	


}
