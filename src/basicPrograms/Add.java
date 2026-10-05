package basicPrograms;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //addition
		//number + number = number
		int a = 10;
		int b = 20;
		System.out.println("sum of number:"+ (a+b));//sum of number:30
		
		//number + character = number
		int x = 20;
		char z = 'A' ;// ASCII 65
		System.out.println("sum:" + (x + z)); //20+65 = 85
		
		//character + character = number
		char ch = 'B';
		char ch1 = 'b';
		System.out.println("sum : " + (ch+ch1));//sum : 164
		
		//concatenation
		//string + string = string
		String firstName = "Sakshi";
		String lastName = "Bodadkar";
		System.out.println(firstName + " " + lastName);//Sakshi Bodadkar
		
		//string + number = string
		String name = "sakshi";
		int R = 100;
		System.out.println(name + R);
		
		//string + boolean = string
		
		String working = "isWorking";
		boolean isWorking = true;
		System.out.println(working + " "+ isWorking);
		
		
		
	}

}
