package abes.intro;

import java.util.Scanner;
public class InputTypes {
	
	public static void main(String[] a) {
		
		String str = "10 20 30";
		Scanner sc = new Scanner(str);
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		String str1 = "10:20:30";
		Scanner sc1 = new Scanner(str);
		sc.useDelimiter(":");
		System.out.println(sc1.next());
		System.out.println(sc1.hasNext());
		System.out.println(sc1.next());
		System.out.println(sc1.hasNext());
		System.out.println(sc1.next());
		System.out.println(sc1.hasNext());
	}

}
