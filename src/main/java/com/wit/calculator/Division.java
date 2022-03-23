package main.java.com.wit.calculator;

import java.math.BigDecimal;
import java.math.MathContext;

/**
* <b>Calculator</b>
* Funcionalidade b�sicas de uma calculadora
* que d� suporte para dois n�meros fornecidos e retorna o resultado
*
* @author  Luiz Carlos Fernandes
* @version 1.0
* @since   2022-03-23
*<p>
* Este � o m�todo Divis�o.
* @param a NUMBER e b NUMBER
* @return result.
*/
public class Division {
	private final BigDecimal aBig;
	private final BigDecimal bBig;
	private final int precision;
	
	public Division(Double a, Double b, int precision) {
		this.aBig=new BigDecimal(Double.valueOf(a));
		this.bBig=new BigDecimal(Double.valueOf(b));
		this.precision=precision;
	}

	public BigDecimal getResult() {
		MathContext mathcontext = new MathContext(precision);		
		return aBig.divide(bBig, mathcontext);
	}
}
