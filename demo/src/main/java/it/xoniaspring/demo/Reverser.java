package it.xoniaspring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("rovescio")
@Component
public class Reverser implements StringTrans {

	@Override
	public String transform(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	
	

}
