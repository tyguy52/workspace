import java.util.*;

public class NumberRunner 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		RationalNumber rn = new RationalNumber(1,3);
		System.out.println(rn);
		
		System.out.print("");
		System.out.println("please enter a rational number");
		String rational = input.next();
		RationalNumber.parseRational(rational);
		
		
		RationalNumber test = new RationalNumber (numer, denom);
		
		if (denom == 0)
		{
			System.out.println("Cannot divide by zero, please enter a new value for the denominator");
			denom = input.nextInt();
			
			while(denom == 0)
			{
				System.out.println("Cannot divide by zero, please enter a new value for the denominator");
				denom = input.nextInt();
			}
			test.setDenominator(denom);
		}	
			
		System.out.println(test);
		System.out.println(RationalNumber.rationalAddition(13, 13.4));
		
		input.close();
	}
}
