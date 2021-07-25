import java.util.Scanner;

public class Test
{
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args)
	{
		NumeroComplejo n1;
		NumeroComplejo n2;
		String temp;
		double rRandom;
		double iRandom;
		for(int i = 0; i <10; i++)
		{
			rRandom = (int)(Math.random() * 10);
			iRandom = (int)(Math.random() * 10);
			n1 = new NumeroComplejo(rRandom, iRandom);
			System.out.println("A: " + n1);

			rRandom = (int)(Math.random() * 10);
			iRandom = (int)(Math.random() * 10);
			n2 = new NumeroComplejo(rRandom, iRandom);
			System.out.println("B: " + n2);
			System.out.println("A + B : " + NumeroComplejo.sumar(n1,n2));
			System.out.println("A - B : " + NumeroComplejo.restar(n1,n2));
			System.out.println("A * B : " + NumeroComplejo.multiplicar(n1,n2));
			System.out.println("A / B: " + NumeroComplejo.dividir(n1,n2));
			System.out.println("\n");


		}
		
		
		
		
		
		
		


	}
}