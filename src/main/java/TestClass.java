
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main class ");

	}

}
 class A{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void m1() {
		System.out.println("A m1");
		
	}
}
class B extends A{
	void m1() {
		System.out.println("B m1");
		
	}
	
}
class C extends B{
	void m1() {
		System.out.println("C m1");
		
	}

}

