package LacosRepeticao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int x;		
			
				for (x=1000;x<=1999;x++)
				{
					if (x%11==6)
					{
						System.out.println(x);
					}
				}
	}

}
