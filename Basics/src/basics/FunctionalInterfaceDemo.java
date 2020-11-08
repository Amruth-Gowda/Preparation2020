package basics;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//lambda expression
		// <Functional_interface> <obj_name> = (args) -> ( <implementation of the function> ); 
		Sample e = (a, b) -> (a-- * ++a + --b * b++);
		//5 * 5 + 4 * 4 = ?41
		System.out.println(e.sum(5, 5)); //
	}

	@FunctionalInterface
	interface Sample {
		public int sum(int a, int b);
	}
}
