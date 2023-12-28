/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	
	int randomNumber = 0;
	int randomNumber1 = -1;
	int n = 1;

	while ( n == 1 ){
		randomNumber = (int)(Math.random() * 10);

			if (randomNumber >= randomNumber1){
		     	System.out.print(randomNumber + " ");
		     	 randomNumber1 =  randomNumber;
			} else {
				n = 2;
			}

	}


	}
}
