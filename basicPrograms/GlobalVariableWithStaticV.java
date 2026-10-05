package basicPrograms;

public class GlobalVariableWithStaticV{
    //static variable
	static  double radius = 3.5;
	static  double area;
	
	public static void main(String[] args) {
	
	System.out.println(area);//0.0 default value assign to global variable if it not assign
	//access directly
	area = 3.14 * radius * radius;
	System.out.println(area);//38.465
	System.out.println(radius);//3.5
	//using className
	System.out.println(GlobalVariableWithStaticV.area);//38.465
	
		

	}

}