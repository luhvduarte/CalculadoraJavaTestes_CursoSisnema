package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import principal.Calculadora;

class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	
	@Test
	@DisplayName("Soma de números positivos")
	void testSomaNumerosPositivos_ResultadoPositivo() {
		assertEquals(5, calc.soma(3, 2));
	}
	
	@Test
	@DisplayName("Soma de números negativos")
	void testSomaNumerosNegativos_ResultadoNegativo() {
		assertEquals(-3, calc.soma(-1, -2));
	}
	
	@Test
	@DisplayName("Subtração de Positivos")
	void testSubtracaoNumerosPositivos_ResultadoPositivo() {
		assertEquals(1, calc.subtracao(2,  1));
	}

	@Test
	@DisplayName("Subtração de Negativos")
	void testSubtracaoNumerosNegativo_ResultadoNegativo() {
		assertEquals(-1, calc.subtracao(-3,  -2));
	}
}
