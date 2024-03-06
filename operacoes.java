package exercicios_0603;

import java.util.Scanner;
public class operacoes {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		float a, b, mt, dv, sm, sb;
		
		System.out.print("Digite o primeiro valor: ");
		a = jc.nextFloat();
		
		System.out.print("Digite o segundo valor: ");
		b = jc.nextFloat();
		
		mt = a*b;
		dv = a/b;
		sm = a+b;
		sb = a-b;
		
		System.out.println(" ");
		System.out.println("Seu valor em multiplicação é: " + mt);
		System.out.println(" ");
		System.out.println("Seu valor em divisão é: " + dv);
		System.out.println(" ");
		System.out.println("Seu valor em soma é: " + sm);
		System.out.println(" ");
		System.out.println("Seu valor em subtração é: " + sb);

	}

}
