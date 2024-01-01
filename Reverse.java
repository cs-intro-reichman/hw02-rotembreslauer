/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
		String a = (args[0]);

		int n = a.length();

		for (int i = n - 1; i >= 0; i --) {
			System.out.print( a.charAt(i));

		}

		int Middle = (n / 2);

		System.out.println();

		if ((n % 2) == 0 ) {
			System.out.println("The middle character is " + a.charAt(Middle -1));
	
		} else {

		System.out.println("The middle character is " + a.charAt(Middle));

	    }
    }
}
