package codeSnippets;

class No {
	int i;
}// end of class

public class assignment {

	public static void main(String[] args) {
		// create objects
		No n1 = new No();
		No n2 = new No();

		// set variables
		n1.i = 9;
		n2.i = 47;

		System.out.println("1: n1.i: " + n1.i + "n2.i: " + n2.i);
		n1 = n2; // aliasing

		System.out.println("2: n1.i: " + n1.i + "n2.i: " + n2.i);
		n1.i = 27; // will change n2 also

		System.out.println("3: n1.i: " + n1.i + "n2.i: " + n2.i);
	}
}
