package it.xoniaspring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//per dire a spring che questo è un bean, dobbiamo metter l'annotazione:
@Component
//in qeusto modo spring istanzierà la classe al posto nostro
public class CLI implements CommandLineRunner {

	
	 //cosi ottengo una istanza di stringTrasformer direttamente da Spring
	@Autowired
	private StringTransformer stringTransformer;
	

	// cosi ottengo una istanza di uppercaser direttamente da Spring
	@Autowired
	@Qualifier("maiuscolo")
	private StringTrans upper;

	// cosi ottengo una istanza di reverser direttamente da Spring
	@Autowired
	@Qualifier("rovescio")
	private StringTrans revs;

	@Override
	public void run(String... args) throws Exception {
		if(args.length > 0) {
			System.out.println(stringTransformer.transform(args[0]));
			System.out.println(upper.transform(args[0]));
			System.out.println(revs.transform(args[0]));
		}

	}

}
