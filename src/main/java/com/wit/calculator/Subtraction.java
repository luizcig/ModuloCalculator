package main.java.com.wit.calculator;
/**
* <b>Calculator</b>
* Funcionalidade b�sicas de uma calculadora
* que d� suporte para dois n�meros fornecidos e retorna o resultado
*
* @author  Luiz Carlos Fernandes
* @version 1.0
* @since   2022-03-23
*<p>
* Este � o m�todo Subtra��o.
* @param a NUMBER e b NUMBER
* @return result.
*/
public class Subtraction {

	private final Double a;
	private final Double b;
	
	public Subtraction(Double a, Double b) {
		this.a = a;
		this.b = b;
	}

	public Double getResult() {
		return a-b;
	}
}
