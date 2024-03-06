package exercicios_0603;

import java.util.Scanner;
public class areaTriangulo {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		float bs, alt, ar;
		
	System.out.print("Informe a base do triangulo: ");
	bs = jc.nextFloat();
	
	System.out.print("Informe a altura do triangulo: ");
	alt = jc.nextFloat();
	
	ar = (bs*alt)/2;
			
	System.out.print(" ");
	System.out.print("A área do triangulo é : " +ar);

	jc.close();
	}

}
