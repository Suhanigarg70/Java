package abes.intro;

public class MethodOverloading {
	
	public static void main(String[] a) {
		
		System.out.println(add(30,56));
		System.out.println(add(30,56,45));
		System.out.println(add(30.90,87.99));
	}
	
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;	
		System.out.println("First");
		return sum;
	}
	public static double add(double  num1, double num2) {
		
		System.out.println("Second");	
		return num1+ num2;
	}
	
	public static int add(int num1, int num2, int num3) {
	
		int sum = num1 + num2 + num3;	
		System.out.println("Third");
		return sum;
	}
	

}
