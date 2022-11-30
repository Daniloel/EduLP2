package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Seguro {

	private int numApolice;
	private String nome;
	private float valor;
	private float premio;
	private Endereco endereco;
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(", getNumApolice()=");
		stringBuilder.append(getNumApolice());
		stringBuilder.append(", getNome()=");
		stringBuilder.append(getNome());
		stringBuilder.append(", getValor()=");
		stringBuilder.append(getValor());
		stringBuilder.append(", getPremio()=");
		stringBuilder.append(getPremio());
		stringBuilder.append(", getEndereco()=");
		stringBuilder.append(getEndereco());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	

}
