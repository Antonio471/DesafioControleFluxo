package app;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro ");
		int parametroUm = entrada.nextInt();
		System.out.print("Digite o segundo parâmetro ");
		int parametroDois = entrada.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
		entrada.close();
		
	}
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior do que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		for (int i=1; i<=contagem; i++) {
			System.out.println(i);
		}
	}
}
