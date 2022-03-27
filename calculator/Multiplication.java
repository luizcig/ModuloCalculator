package main.java.com.wit.calculator;

/**
* <b>Calculator</b>
* Funcionalidade básicas de uma calculadora
* que dá suporte para dois números fornecidos e retorna o resultado
*
* @author  Luiz Carlos Fernandes
* @version 1.0
* @since   2022-03-23
*<p>
* Este é o método Multiplicação.
* @param a NUMBER e b NUMBER
* @return result.
*/
public class Multiplication {
	private final Double a;
	private final Double b;
	
	public Multiplication(Double a, Double b) {
		this.a = a;
		this.b = b;
	}

	public Double getResult() {
		return a*b;
	}
}
