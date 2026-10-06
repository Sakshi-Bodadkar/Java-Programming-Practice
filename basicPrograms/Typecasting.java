package basicPrograms;

public class Typecasting {

	public static void main(String[] args) {
        //Primitive typecasting - widening, narrowing
		
		//widening- conversion of primitive datatype from smaller p.d to larger p.d
		//implicit widening
		short s = 2000;
		int i = s;
		System.out.println(i);
		
		//explicit widening
		short a = 200;
		int b =(int)a;
		System.out.println(b);
		
		//char into int
		char ch = 'A';
		int n = ch;
		System.out.println(n);
		
		//int into double
		int num = 100;
		double dbl = num;
		System.out.println(dbl);//100.0
		
		//narrowing - conversion of primitive datatype from larger p.d into smaller p.d
		//explicit narrowing 
		long l = 100;
		byte byt = (byte)l;
		System.out.println(byt);//100
		
		double marks = 78.90;
		int m = (int)marks;
		System.out.println(m);//78

		//Integer Overflow
		int x = 130;
		byte b1 = (byte)x;
		System.out.println(b1);//-126
		
		byte b2 = 126;
		int i1 =(int) b2;
		double dbl1 = (double) i1;
		float z = (float)dbl1;
		System.out.println(z);//126.0
		
	}

}
