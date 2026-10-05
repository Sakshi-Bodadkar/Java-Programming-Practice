package basicPrograms;

public class GlobalVariableWithNonStaticV {
    //non static variable
	String name = "sakshi";
	int sid = 111;
	String course = "Java FullStack";
	
	public static void main(String[] args) {
		
	// object creation to access non static variable
	
		GlobalVariableWithNonStaticV v1 = new GlobalVariableWithNonStaticV();
		GlobalVariableWithNonStaticV v2= new GlobalVariableWithNonStaticV();
		System.out.println(v1);//return reference
		System.out.println(v2);//return reference
		
		//access non static variable by reference
		System.out.println(v1.name);//sakshi
		System.out.println(v1.course);//Java Fullstack
		
		//reassigning using reference
		v1.name = "Aditi"; 
		v1.course = "Software Testing";
		System.out.println(v1.name);//Aditi
		System.out.println(v1.course);//Software Testing
		

		
	

	}

}
