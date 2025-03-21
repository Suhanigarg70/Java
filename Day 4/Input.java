package abes.intro;

import java.util.Scanner;
public class Input {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a num:");
		int num = ip.nextInt();
		System.out.println(num);
		
		System.out.println("Enter a String:");
		String s = ip.next();
		System.out.println(s);
		
		System.out.println("Enter a Boolean:");
		boolean b = ip.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter a float:");
		float f = ip.nextFloat();
		System.out.println(f);
		
	}

}
