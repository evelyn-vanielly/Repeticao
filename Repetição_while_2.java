package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int p=0, sexo, idade, status=0, c=0, a=0, n=0, pn=0, pc=0;
		
		while (p<150)
		{   
			p++;
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite: 1 - feminino \n	 2 - masculino.");
			sexo = ler.nextInt();
			
			switch (sexo)
			{
				case 1: 
					break;
						case 2:
							break;	
			}
			
				System.out.println("Digite seu status: 1 - calmo(a) \n		2- nervoso(a) \n		3 - agressivo(a)");
				status = ler.nextInt();
				
				switch(status)
				{
					case 1:
						c++;
						break;
							case 2:
								break;
									case 3:
										break;
											default: 
											  System.out.println("\n");
				}
				
				if (sexo==1 && status==2) 
				{
					n++;
				}
					else if (sexo==2 && status==3)
					{
					a++;
					}
				if (idade>=40 && status==2)
				{
					pn++;
				}
					else if (idade<=18 && status==1)
					{
					pc++;
					}
		} System.out.println ("O número de pessoas calmas é de: "+c);
		  System.out.println ("O número de mulheres nervosas é de: "+n);
		  System.out.println("O número de homens agressivos é de: "+a);
		  System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+pn);
		  System.out.println("O número de pessoas calmas com menos de 18 anos é: "+pc);
		
	}

}
