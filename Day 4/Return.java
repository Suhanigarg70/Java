package abes.intro;

public class Return {
	
	public static void main(String[] a) {
		
		int sum  = add(20,30);
		System.out.println(sum);
		System.out.println(add(30,56));
	}
	
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;	
		return sum;
	}

}
