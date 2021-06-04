package br.com.generation.laco.repeticao;

public class LacoRepeticaoFor {

	public static void main(String[] args) {
	
		int n = 20;
		int soma = 0;
		
		for(int i=0; soma<=n; i++) {
		// ->for(inicio ; condição ; incremento ou decremento)
			 
			System.out.println("Soma = " +soma+ " + " +i);
			soma+=i; //soma = soma + i;
			System.out.println(" = " +soma+ "\n");
		}
	}
}
