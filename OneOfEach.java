
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		String gender1 = "0";
		String gender2 = "1";
		boolean flag = true;
		int counter = 0;

		do{
			double j = Math.random();
			counter += 1;

			if(j > 0.5){
				gender1 = "g";
			} else {
				gender1 = "b";

			}

			System.out.print(gender1 + " ");

			if((gender1 != gender2) && (counter > 1)){
				flag = false;

			System.out.println();
			System.out.println("You made it... and you now have " + counter + " children");
			}	

			gender2 = gender1;

		} while (flag);
			
	}
}
	

	
