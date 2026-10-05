package basicPrograms;

public class SwapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a = 30;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println("a="+ a);
		System.out.println("b="+ b);
	}

}
