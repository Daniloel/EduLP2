package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Endereco {

	private String enderecoCompleto;
	private String cidade;
	private String estado;
	private String cep;

	public String ImprimiEndereco() {

		return enderecoCompleto;
	}

}
