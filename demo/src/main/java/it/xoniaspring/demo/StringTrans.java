package it.xoniaspring.demo;

import org.springframework.stereotype.Component;

@Component
public interface StringTrans {
	
	public String transform(String input);
}
