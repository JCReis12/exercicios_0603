package exercicios_0603;

import java.util.Scanner;
public class carroCombustivel {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		float dist, valor,cons, ct, quant;
		
		System.out.print("Qual o preço da gasolina: ");
		valor = jc.nextFloat();
		
		System.out.print("Qual a distancia percorrido: ");
		dist = jc.nextFloat();
		
		System.out.print("Qual o consumo médio do seu veículo: ");
		cons = jc.nextFloat();
		
		quant = dist/cons;
		
		System.out.println(" ");
		System.out.println("Você utilizou " +quant+ " Litros de gasolina");
		
		
		ct = quant*valor;
		System.out.println(" ");
		System.out.print("Seus custos são de R$ "+ct+" reais");
	}

}