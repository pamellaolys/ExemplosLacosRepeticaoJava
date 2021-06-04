package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class LacoRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int numero =0;
		
		while(numero != 10) {
			System.out.println("Digite um numero: ");
			numero = in.nextInt();
			
			if(numero == 10) {
				System.out.println("ACERTOU!");
			}
			else {
				System.out.println("ERROU :( ");
			}
		}
	}
}
