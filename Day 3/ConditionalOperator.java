package abes.intro;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		int n1 = 2;
		int n2 = 4;
		System.out.println(n1>n2?"n1":"n2");
		
		int num1 = 40;
		int num2  = 70;
		int num3  = 60;
		System.out.println(num1>num2?num1>num3?"num1":"num3":num2>num3?"num2":"num3");
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(++num1);
		
		
				
	}
}
