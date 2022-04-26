package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		
		
		try {
			conta.saca(210);

			
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: "+ ex.getMessage());
			// TODO: handle exception
		}

		
		System.out.println(conta.getSaldo());
		
	}

}
