package br.com.erudio.converters;

import org.springframework.stereotype.Component;

@Component
public class NumberConverter {

	public Double convertToDouble(String numb) {
		if(numb==null) return 0.0;
		String number = numb.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public boolean isNumeric(String input) {
		if(input==null) return false;
		String number = input.replaceAll(",", ".");
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		}
	
	
	
}
