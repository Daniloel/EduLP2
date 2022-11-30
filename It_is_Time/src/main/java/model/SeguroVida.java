package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeguroVida extends Seguro {

	private String beneficiario;
	private Data datanasc;
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SeguroVida [getBeneficiario()=");
		stringBuilder.append(getBeneficiario());
		stringBuilder.append(", getDatanasc()=");
		stringBuilder.append(getDatanasc());
		stringBuilder.append("]");
		stringBuilder.append( super.toString());
		return stringBuilder.toString();
	   
	}
	
	
	
	
	
	
}
