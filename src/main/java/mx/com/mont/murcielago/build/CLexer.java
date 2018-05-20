package mx.com.mont.murcielago.build;

import java.io.File;
import java.net.URISyntaxException;

public class CLexer {

	public static void main(String[] args) {
		
		File lexer;
		try {
			System.out.println(CLexer.class.getResource("/lexer/rules.jflex"));;
			lexer = new File(CLexer.class.getResource("/lexer/rules.jflex").toURI());
			jflex.Main.generate(lexer);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}

}
