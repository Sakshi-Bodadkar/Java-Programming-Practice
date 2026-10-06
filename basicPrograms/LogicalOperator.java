package basicPrograms;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//Logical AND(&&)
		//number in range 1-50
		int num = 45;
		System.out.println(num >=1 && num <=50);//true
		
		//given alphabet UpperCase or not
		char ch = 'H';
		boolean condition = (ch>='A' && ch<='Z');
		System.out.println(condition);//true
		
		//number is divisible by 3 and 5
		int n = 31;
		System.out.println(n % 3 == 0 && n % 5 == 0);//false
	
		//Logical OR(||)
		//check given operand vowel or not
		char char1 = 'I';
		boolean result = (char1 == 'A' || char1 == 'E' || char1 == 'I'|| char1 == 'O' || char1 =='U' ||char1 == 'a'|| char1 == 'e' || char1 == 'i'|| char1 == 'o' || char1 =='u' );
		System.out.println(result);//true
        
		//Logical NOT(!)
		System.out.println(!true);//false
		
		int a = 21;
		int b = 22;
		System.out.println(!(a<b));
	}
}
