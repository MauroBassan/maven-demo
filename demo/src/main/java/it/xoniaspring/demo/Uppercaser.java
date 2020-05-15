package it.xoniaspring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("maiuscolo")
@Component
public class Uppercaser implements StringTrans {

	@Override
	public String transform(String input) {
		return input.toUpperCase();
	}
	
	

}
