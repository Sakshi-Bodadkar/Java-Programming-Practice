package basicPrograms;

public class IncrementOperator {

	public static void main(String[] args) {
		
		//Pre-increment Operator
       int a = 18;
       System.out.println(++a);//19
       System.out.println(a);//19
       
       char ch = 'G';
       System.out.println(++ch);//H
       
       //Post-increment operator
       int b = 20;
       System.out.println(b++);//20
       System.out.println(b);//21
       
       //Pre-decrement operator
       int z = 1;
       System.out.println(--z);//0
       System.out.println(z);//0
       
       char chr = 'G';
       System.out.println(--chr);//F
       
       //Post decrement operator
       int Z = 1;
       System.out.println(Z--);//1
       System.out.println(Z);//0
       
       char chrr = 'G';
       System.out.println(chrr--);//G
       System.out.println(chrr);//F
       
       
       
	}

}
