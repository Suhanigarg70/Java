package abes.intro;

public class Method {
	public static void main(String[] a) {
		add();
	}
	
	public static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println("Main start");
		m1();
		System.out.println("Main End");
	}
   
	 static void m1(){
		System.out.println("M1 start");
		m2();
		System.out.println("M1 end");
	}
	 
	 static void m2(){
			System.out.println("M2 start");
			m3();
			System.out.println("M2 end");
		}
	 static void m3(){
			System.out.println("M3 start");
			System.out.println("M3 end");
		}
}
