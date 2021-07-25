/*
La clase Numero complejo poseee dos atributos del tipo double para representar la parte real y la parte imaginaria de una número complejo
Posee dos parametros
@parameter: real
@parameter: imaginario
@author: Roquiko
@version: 24/07/21


*/
public class NumeroComplejo
{
	private double real;
	private double imaginario;

	

	public NumeroComplejo()
	{
		real = 0.0D;
		imaginario  = 0.0D;
	}
	public NumeroComplejo(double real, double imaginario)
	{
		this.real = real;
		this.imaginario = imaginario;
	}
	public NumeroComplejo(String numeroComplejo)
	{
		String realStr = "";
		String imaginarioStr = "";
		String numeroStr = "";

		double imag;
		double rl;

		int indiceInicioNumero = 0;
		int indiceFinNumero = 0;


		boolean esFinNumero = false;
		boolean esNumeroReal=true;
		//double real;
		//double imaginario;
		int nuevoInicio = 0;
		for(int i = 0; i < numeroComplejo.length(); i++)
		{
			indiceFinNumero = i;
			if(numeroComplejo.charAt(i) == '-' || numeroComplejo.charAt(i) == '+' || numeroComplejo.charAt(i) == 'i')
			{
				if(indiceInicioNumero == indiceFinNumero)
				{
					continue;
				}
				else if(numeroComplejo.charAt(i) == 'i')
				{
					esNumeroReal = false;
				}
				
				//sFinNumero = true;
				if(esNumeroReal)
				{

					realStr = numeroComplejo.substring(indiceInicioNumero,indiceFinNumero);
					this.real = Double.parseDouble(realStr);
				}
				else
				{
					imaginarioStr = numeroComplejo.substring(indiceInicioNumero,indiceFinNumero);
					this.imaginario = Double.parseDouble(imaginarioStr);
					
				}
				indiceInicioNumero = indiceFinNumero;
			}	
		}
	}
	public static NumeroComplejo sumar(NumeroComplejo x, NumeroComplejo y)
	{
		NumeroComplejo r = new NumeroComplejo(x.real + y.real, x.imaginario + y.imaginario);
		return r;
	}
	public static NumeroComplejo restar(NumeroComplejo x, NumeroComplejo y)
	{
		NumeroComplejo r = new NumeroComplejo(x.real - y.real, x.imaginario - y.imaginario);
		return r;
	}
	public static NumeroComplejo multiplicar(NumeroComplejo x, NumeroComplejo y)
	{
		NumeroComplejo r = new NumeroComplejo((x.real * y.real - x.imaginario * y.imaginario), (x.real*y.imaginario + y.real*x.imaginario));
		return r;

	}

	public static NumeroComplejo dividir(NumeroComplejo x, NumeroComplejo y)
	{
		NumeroComplejo r = new NumeroComplejo(x.real * y.real + x.imaginario * y.imaginario, y.real * x.imaginario - y.imaginario * x.real);
		r.multiplicarEscalar(1/y.conjugado().normaCuadrada());
		return r;

	}
	public NumeroComplejo conjugado()
	{
		NumeroComplejo r = new NumeroComplejo();
		r.real = this.real;
		r.imaginario = -this.imaginario; 
		return r;

	}
	public double normaCuadrada()
	{
		return Math.pow(this.real, 2) + Math.pow(this.imaginario, 2);
	}


	public void multiplicarEscalar(double k)
	{
		this.real *= k;
		this.imaginario *=k;

	}

	public String toString()
	{
		String numComplejoStr;
		String realStr;
		String imaginarioStr;
		realStr = String.valueOf(real);
		imaginarioStr = String.valueOf(imaginario);

		numComplejoStr = realStr + (imaginarioStr.charAt(0) == '-' ? " - " + imaginarioStr.substring(1) : " + " + imaginarioStr) + "i.";

		return numComplejoStr;
	}


}