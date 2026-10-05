package basicPrograms;

public class division {

	public static void main(String[] args) {
		 
		// / it perform division and return quotient
		int num = 148;
		//remove last digit
		num = num/10;
		System.out.println(num);//14
        
		// % it extract last 1 digit and return remainder
	     int n = 1234;
	     int lastDigit = n%10;
	     System.out.println(lastDigit);//4
	     
	     int n1 = 1234;
	     int last2Digit = n1%100;
	     System.out.println(last2Digit);//34
	     
	     //numerator > denominator ===> remainder < denominator
	     System.out.println(12%5);//2
	     System.out.println(18%10);//8
	     
	     //numerator < denominator ===> remainder = numerator
	     System.out.println( 0 % 12);//0
	     System.out.println( 4 % 12);//4
	     System.out.println( 5 % 8);//5
	     
	     //numerator = denominator ===> remainder = 0
	     System.out.println(12%12);//0
	     System.out.println(12 % 2);//0
	     
	     System.out.println(12 % 0);//ArithmeticException can't divide 12 by 0 
	     System.out.println(120 % 0); //ArithmeticException can't divide 120 by 0
	     
	}

}
