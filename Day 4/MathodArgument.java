package abes.intro;

public class MathodArgument {
	public static void main(String[] a) {
		add(90,67);
		add(94,7);
		add(9,670);
		add(12,97);
		ch('B');
	}
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	public static void ch( char ch) {
		System.out.println((ch>=65 && ch<=91)?(char)(ch+32):(char)ch);
	}

}