package excaption;

public class ExceptionCreate {
	public static void main (String [] a) {
		int age = 17;
		if (age <18) {
			throw new ArithmeticException("your age invalid");
		}
	}

}
