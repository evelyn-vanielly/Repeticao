package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String args[])
	{
		Scanner ler=new Scanner(System.in);
		int num, x=0;
		float media, soma=0;
		
		do
		{
			System.out.println("Insira um n�mero de 1 a 9: ");
			num = ler.nextInt();
			
			if (num%3==0) 
			{
			 soma=soma+num;
			 x++;
			}
			
		}while (num!=0);
		
		media=soma/x;
		
		System.out.println ("A media dos multiplos de 3 �: "+ media);
		
	} 
	
}

