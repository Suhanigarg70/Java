package abes.intro;

public class Area {
	
	public static void main(String[] a) {
		
		System.out.println(area(8));
		System.out.println(cube(8));
		System.out.print(num(8));
	}
	
	public static double area(int r) {
		double area  = 3.14*(r*r);
		return area;
	}
	
	public static int cube(int l) {
		int cube = l*l*l;
		return cube;
	}
	
	public static String num(int a) {
		int s = a/2;
		return (s==1?"Odd":"Even");
	}
   
}
