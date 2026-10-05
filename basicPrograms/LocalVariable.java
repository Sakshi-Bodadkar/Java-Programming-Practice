package basicPrograms;

public class LocalVariable {

	public static void main(String[] args) {
	  
		
		int a = 12;
		
		System.out.println(a);//12
		{
			int b = 100;
			a = 24;
			System.out.println(a);// 24
			System.out.println(b);//100
		}
		System.out.println(a);
		//System.out.println(b);//CTE accessing outside its scope/block

	}

}
