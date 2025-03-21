package abes.intro;

public class MethodStorage {
	static int num = 0;
	public static void main(String[] a) {
		m1();
	}
   
	 static void m1(){
		num++;
		m2();
		
	}
	 
	 static void m2(){
			System.out.println(num);
			m1();
			
		}
	
}
