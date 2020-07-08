package LacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String args[])
	{
		Scanner ler=new Scanner(System.in);
		int num=0, soma=0;
		
		do
		{
			System.out.println("Insira um número de 1 a 9: ");
			num = ler.nextInt();
			soma= soma+num;
			
		}while (num!=0);
		
		System.out.println ("A soma dos números é: "+soma);
	} 

}
