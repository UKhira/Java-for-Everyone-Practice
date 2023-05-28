import java.lang.Math;
public class III_Operators {
	public static void main(String[] args) {
		int i = 2;
		i++;
		System.out.println(i);
		// This will add 1 to i (2+1=3)

		i--;
		System.out.println(i);
		//TODOThis well substract 1 from new i (3-1=2)
		
		System.out.println(7/4);		// ** => since these are both integers this will only output without remainder(DIV in python)
		System.out.println(7/4.0);		// *! => these 3 will outpui thee complete answer (Normal division)
		System.out.println(7.0/4);
		System.out.println(7.0/4.0);

		System.out.println(7%4); 		// ? => this will output the remainder(same as in python)

		/* Imagine we need to seperate a the large measurement from its smaller,
		 * like seperate GB amount in xMBs, l amount in x ml s.rs amount in x cents,...etc
		 * for these we can use int/int method 
		*/
		int cents = 128;
		int rupees = cents/100;
		System.out.println(rupees);
		
		// ! in java there is no symbol for power and root, to compute them we have to use methods

		double powerOf = Math.pow(2,5);
		// ! the variable for calculating these methods must be a double
		System.out.println("2 to the power 5 is "+powerOf);

		double squareRoot = Math.sqrt(25);
		System.out.println("Square Root of 25 is "+squareRoot);

		double Sine = Math.sin(90);
		System.out.println("Sine 90 is "+ Sine);

		double Cosine = Math.cos(45);
		System.out.println("Cos 45 is "+Cosine);

		double Tanjan = Math.tan(0);
		System.out.println("Tan 0 is "+Tanjan);

		double Radian = Math.toRadians(30);
		System.out.println("30 degree is "+ Radian + " in radian");

		double Degree = Math.toDegrees(0);
		System.out.println("0 radian is equals to "+Degree +" degrees");

		double eToThePower = Math.exp(2);
		System.out.println("e to the power 2 is "+eToThePower);

		double doubledecimalLog = Math.log(100);
		System.out.println("Decimal log of 100 is " +doubledecimalLog);

		double roundMethod = Math.round(127.712);
		System.out.println("Closet integer to 127.712 is "+roundMethod);


		// ? these method doesn't necessary need a double for calculate
		int absolute = Math.abs(-3);
		System.out.println("Absolute value of -3 is "+absolute);

		int Max = Math.max(2, 10);
		System.out.println("The maximum of 2 and 10 is "+Max);

		int Min = Math.min(-5,-20);
		System.out.println("The minimum of -5 and -20 is"+Min);
	}
}