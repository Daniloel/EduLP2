package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Data {

	private int  dia;
	private int mes;
	private int ano;

	public String imprimirData(String Data) {

		return Data;

	}

}
