/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int a = Integer.parseInt(args[0]);
		String answer = ( a + " is a perfect number since " + a + " = 1");
		int sum = 1; 

		for(int i = 2; i < a; i++ ){
			if( (a % i) == 0 ){

		 	answer = answer + " + " + i;
		 	sum = sum + i;

		 	}
		
		}
	
		if (((sum != 1) && ((sum / a) == 1)) || ( sum == 1 )){
			System.out.println(answer);
		} else {
			System.out.println(a + " is not a perfect number");
		}
	
	}
}
