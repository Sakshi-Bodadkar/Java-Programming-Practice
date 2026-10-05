package basicPrograms;

public class PrintingStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        System.out.println("Hello World!");
        System.out.println("Hello java");//next line
        System.out.print("Hello sakshi");//same line
        System.out.print("Hello");
        System.out.println();//no err
        System.out.println();//err CTE
      
      
        int a = 10;
        int b = 0;
        System.out.println(a/b);//RTE  ArithemeticException
      
      int[] num = {10,20,30};
      System.out.println(num[5]);//RTE ArrayIndexOutOfBoundsException

	}

}
