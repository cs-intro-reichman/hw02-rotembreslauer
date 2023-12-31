import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats{
	public static void main (String[] args) {
	
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		Random generator = new Random(seed);
         

        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int moreThen4 = 0;
        String gender1 = "0";
		String gender2 = "1";
		boolean flag = true;
     	int counter = 0;


        for(int i = 0; i < T ; i ++){
        	double j = generator.nextDouble();
			
		do{
			 j = generator.nextDouble();
			counter += 1;


			if(j >= 0.5){
				gender1 = "g";
			} else {
				gender1 = "b";
			}

			if((gender1 != gender2) && (counter > 1)){
				flag = false;
			}
		
			gender2 = gender1;
		
		} while (flag);


			if (counter == 2){
				f2 = f2 + 1;
			  } else {
			    if (counter == 3){
				f3 = f3 +1;
			  } else { 
				f4 = f4 +1;
				moreThen4 = moreThen4 + counter;
		}
		flag = true;
		counter = 0;
		}	
	}


	double average = (((f2*2) + (f3*3) + (moreThen4))/(double) T);
		String common = "0";

		if ((f2 > f3) && (f2 > f4)){
		common = "2";
   		 } else if ((f3 > f2) && (f3 > f4)){
		common = "3";
		} else {
		common = "4 or more";
}
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + f2);
		System.out.println("Number of families with 3 children: " + f3);
		System.out.println("Number of families with 4 or more children: " + f4);
		System.out.println("The most common number of children is " + common + ".");		
	}
}


	

