import java.text.*;

public class RationalNumber
{
	private int numerator;
	private int denominator;
	
	public RationalNumber(int numerator, int denominator)
	{
		this.numerator = numerator;
		
		try
		{
			if(denominator == 0)
				throw new Exception();
			this.denominator = denominator;
		}
		catch(Exception e)
		{
			System.err.println("Exception: Cannot divide by zero");
		}
	}
	
	public RationalNumber(int i )
	{
		this.numerator = i;
		this.denominator = 1;
	}
	
	public static int parseRational(String s)
	{
		String[] rationalParse =s.split(" ");
		
		if(rationalParse.length > 1)
		{
			rationalParse = rationalParse[1].split("/");
			int numerator = Integer.parseInt(rationalParse[0]);
			int denominator = Integer.parseInt(rationalParse[1]);
			
			return numerator; 
			
		}
		
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}

	public void setNumeratior(int numerator)
	{
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator)
	{
		try
		{
			if(denominator == 0)
				throw new Exception();
			this.denominator = denominator;
		}
		catch(Exception e)
		{
			System.err.println("Exception: Cannot divide by zero");
		}
	}

	public String toString()
	{	
		String rationalString = numerator + "/" + denominator;
		if(denominator < 0)
			rationalString = numerator*-1 + "/" + denominator*-1;
		
		return rationalString;
	}
	
	public static double rationalAddition(double n1, double n2)
	{
		double doubleSum = n1+n2;
		return doubleSum;
	}

	public double rationalAddition(double n1)
	{
		
	}
}



