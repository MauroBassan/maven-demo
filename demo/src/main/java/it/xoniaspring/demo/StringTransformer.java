package it.xoniaspring.demo;

import org.springframework.stereotype.Component;

@Component
public class StringTransformer {

	// quest classe diventerà una dipendenza di CLI > vedi autowire in classe CLI
	public String transform(String input) {
		return input;
	}
}
