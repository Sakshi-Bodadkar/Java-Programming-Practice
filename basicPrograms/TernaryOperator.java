package basicPrograms;

public class TernaryOperator {

	public static void main(String[] args) {
		//Conditional Operator
		
		//even or odd
		int num = 4;
		String result = (num % 2 == 0 ? "isEven" : "isOdd" );
		System.out.println(result);//isEven
		
		//Largest of two number
		int n1 = 20;
		int n2 = 10;
		System.out.println(n1 > n2 ? n1 + "is larger" : n2 + "is smaller");//20 is larger
		
		//Largest of three number
		
		int num1 = 40;
		int num2 = 20;
		int num3 = 3;
		String res = (num1 > num2 && num1 > num3 ? num1 + " " + "is larger" : (num2 > num3 ? num2  + " " + "is larger" : (num3 + " "+"is larger")));
		System.out.println(res);//40 is larger
		
		
		int x = 10;
		double output = ( x > 5 ? 100 : 10.5);
		System.out.println(output);
		
		//var automatically convert its type
		int x = 10;
		var output =( x > 5 ? 100 : 10.5);
		System.out.println(output);//100.0
		
		int x = 10;
		int output =( x > 5 ? 100 : 10.5);
		System.out.println(output);//CTE can not convert double into int 
		
		//type casting converting double into int
		int x = 10;
		int output = (int)( x > 5 ? 100 : 10.5);
		System.out.println(output);//100.0
		
		

	}

}
