package es.studium.Segun;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, resultado;
		System.out.println("Dame un numero");
		a = teclado.nextInt();
		System.out.println("Dame otro numero");
		b = teclado.nextInt();
		teclado.close();
		if (a < b)
		{
			resultado = (a + b);
			System.out.println("La suma del número1 y el numero2 es: " + resultado);
		} else
		{
			resultado = (a * b);
			System.out.println("El producto del número1 por el numero2 es: " + resultado);
		}

	}

}
