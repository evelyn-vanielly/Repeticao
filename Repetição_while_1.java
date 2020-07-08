package LacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade, total21=0, total50=0;
		
		System.out.println("Entre com sua idade: ");
		idade = ler.nextInt();
		
		while (idade!=-99)
		{
			System.out.println("Entre com sua idade: ");
			idade = ler.nextInt();
			
				if (idade<=21)
				{ 
					total21++;
				}
					else if (idade>=50)
					{
						total50++;
					}	
					
		} 
		
		System.out.println("O total de pessoas com menos de 21 anos é: "+total21);
		  System.out.println("O total de pessoas com mais de 50 anos é: "+total50);
		   
	} 
	
}

