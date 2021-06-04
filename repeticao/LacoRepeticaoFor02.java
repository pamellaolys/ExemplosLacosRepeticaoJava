package br.com.generation.laco.repeticao;

public class LacoRepeticaoFor02 {

	public static void main(String[] args) throws InterruptedException {
		
		int i=0; //inicio
		//for(int i = 0 ; i <=10 ; i++) { for estruturado
		
		for(;i<=10;) { //for fragmentado (condição)
			i+=3;// i = i+3 //incremento
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
