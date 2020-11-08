package basics;

interface Bi {
	void add();
}

interface C {
	void add();
}

public class InterfaceExample1 implements Bi, C {
	public void add() {
	}

	public static void main(String[] args) {
		InterfaceExample1 a = new InterfaceExample1();
		Bi b = new InterfaceExample1();
		C c = new InterfaceExample1();
		System.out.println(b instanceof Bi);//True 
		System.out.println(c instanceof Bi);//false 
		System.out.println(b instanceof C);//false 
		System.out.println(c instanceof C);//True 
		System.out.println(a instanceof Bi);//false 
		System.out.println(a instanceof C);//false 
		
		if (b instanceof Bi && c instanceof C) {
			System.out.println("b");//prints b
		}

		if (a instanceof Bi && a instanceof C) {
			System.out.println("c"); //prints C
		}
	}
}
