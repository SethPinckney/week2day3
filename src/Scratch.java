
public class Scratch {
	
	public static final int DAYS_IN_WEEK = 7;  // declaring a variable as static final means that the value is a constant
	
	public static void main(String[] args) {
		final int dontChangeMe;  // a final variable may not be changed after it has been initialzed.
		dontChangeMe = 1;		// here we are initializing dontChangeMe
		// dontChangeMe = 2; // compile error because dontChangeMe has already been initialized
	}
}
