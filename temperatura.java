package exercicios_0603;

import java.util.Scanner;
public class temperatura {
	
	public static void main (String[]args) {

	Scanner jc = new Scanner(System.in);
	
	float tempf, tempg;
	
	System.out.print("Informe a temperatura atual em Fahrenheit: ");
	tempf = jc.nextFloat();
	
	tempg = ((tempf - 32)*5)/9;
	
	System.out.print("A temperatura em graus celsius é: " +tempg);
	
	
	
	
	
	
	
	}
}
