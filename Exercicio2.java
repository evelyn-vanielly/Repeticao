package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int x, par=0 ,impar=0, cont;
		
		
		for (cont=0;cont<10;cont++)
		{
			System.out.println("Entre com um valor: ");
			x = ler.nextInt();
			
			if (x%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		} System.out.println("Temos "+par+" numeros pares.");
		System.out.println("Temos "+impar+" numeros impares.");
	}

}
