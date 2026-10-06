package basicPrograms;

public class CompoundAssignOperator {

	public static void main(String[] args) {
       
		double balance = 6000;
		System.out.println(balance);//6000.0
		
		//deposit 
		double deposit = 500;
		balance += deposit; //balance = balance + deposit
		System.out.println(balance);//6500.0
		
		//withdrawal
		
		double withDrawal = 2000;
		balance -= withDrawal;
		System.out.println(balance);//4500.0
		
		int a = 10;
		a = a + 5;
		System.out.println(a);//15
		
		
		
	}

}
