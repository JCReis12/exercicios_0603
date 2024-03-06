package exercicios_0603;

import java.util.Scanner;
public class money {

	public static void main(String[] args) {
	
		Scanner jc = new Scanner(System.in);
		
		double real, conv, dolar, euro, moeda;
		
		System.out.println("Qual o valor que quer transformar: ");
		real = jc.nextDouble();
		
		System.out.println("");
		System.out.println("01 - Dólar");
		System.out.println("02 - Euro");
		System.out.println("");
		System.out.println("Para qual moeda você quer converter?");
		moeda = jc.nextDouble();
		
		if (moeda == 01) {
			conv = real*4.94;
			System.out.println("Seu valor é: "+conv );
	}
		else if (moeda == 02) {
			conv = real*5.37;
			System.out.println("Seu valor é: "+conv );
 }
		else {
			
			System.out.println("Invalido");
}
}
}