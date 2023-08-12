package br.com.gilmarioarantes.validacpf.model;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidaCPFTeste {



            //valida se a quantidade de dígitos informados é maior de 11
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "123456789123"; 
		assertEquals(false, cpfValidator.isCPF(cpfTestado));
	}
            //valida se a quantidade de dígitos é menor que 3	
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "12"; 
		assertEquals(false, cpfValidator.isCPF(cpfTestado));
	}
	   //validar se existe algum caracter que não seja dígito	
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "12abc"; 
		assertEquals(false, cpfValidator.isCPF(cpfTestado));
	}
	  //valida se todos os números são iguais
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "11111111111"; 
		assertEquals(false, cpfValidator.isCPF(cpfTestado));
	}
	// vários cpfs válidos e falsos para garantir o algoritmo
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "93232552030"; 
		assertEquals(true, cpfValidator.isCPF(cpfTestado));
	}
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "19496284000"; 
		assertEquals(true, cpfValidator.isCPF(cpfTestado));
	}
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "19496284000"; 
		assertEquals(true, cpfValidator.isCPF(cpfTestado));
	}
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "43620095078"; 
		assertEquals(true, cpfValidator.isCPF(cpfTestado));
	}
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "43620095073"; 
		assertEquals(false, cpfValidator.isCPF(cpfTestado));
	}
            @Test
            	void TesteValidaCPF() {
		ValidaCPF cpfValidator = new ValidaCPF;
		String cpfTestado = "43620095071"; 
		assertEquals(false, cpfValidator.isCPF(cpfTestado));
	}
	
}
