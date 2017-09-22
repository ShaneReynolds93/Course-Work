package codeSnippets;

class StaticTest {
	static int i = 47;
}

public class StaticFun {
	static int incr() {
		return ++StaticTest.i;
	}

	public static void main(String[] args) {

		// instantiate class StaticTest
		// demonstrate use of static variables
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest.i++; // use the class name
		
		System.out.println("The value of st1 is " + st1.i);
		System.out.println("The value of st2 is " + st2.i);
		System.out.println("The value of directly accessing " + "variable through class is" + StaticTest.i);
	
		//demonstrate use of static methods
		StaticFun sf = new StaticFun();
		System.out.println("The result of method accessing the object is" +sf.incr());
		System.out.println("The result of directly accessing method through the class is" +StaticFun.incr());
		
	}

}
