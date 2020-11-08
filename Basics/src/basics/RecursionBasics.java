package basics;

public class RecursionBasics {

	public void displayValue(int value) {
		if (value > 10)
			return;
		else
			displayValue(value+1);
			
		System.out.println(value);
	}

	public static void main(String[] args) {
		
		RecursionBasics basics = new RecursionBasics();
		basics.displayValue(1);
	}

}
