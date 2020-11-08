package basics;


class TestClass1 {
	TestClass1(){
		System.out.println("Hello");
	}
	void display() {
		System.out.println("Hey! inside display function");
	}
}

public class TestClassOne {

	public static void main(String[] args) {
			TestClass1 class1 = new TestClass1();
			class1.display();
	}

}
