package abes.intro;

public class IncrementOperator {
	
	public static void main(String[] args){
		int a =10;
		int b = a++;
		int c = ++a;
		
		System.out.println(a+" "+b+" "+c);
		
		int x = 30;
		int y = ++x+x;
		int z = --x;
		z++;
		x = y--;
		
		System.out.println(x+" "+y+" "+z);
		
		byte u = 127;
		u++;
		System.out.println(u);
		
		byte s = 10;
		byte t = 20;
		s+=t;
		System.out.println(s);
		System.out.println(t);
		
		int d = 10;
		int e=15;
		e= e+d;
		d= e-d;
		e = e-d;
		System.out.println(d+" "+e);
	}
	

}
