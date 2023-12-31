import java.util.Random;

public class OneOfEachStats{
	public static void main (String[] args) {
	
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		Random generator = new Random(seed);
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int moreThen4 = 0;
     

        for(int i = 0; i < T ; i ++){
        	String gender1 = "0";
			String gender2 = "1";
			int counter = 0;
        
			
		do{
				double j = generator.nextDouble();
			

			if(j >= 0.5){
				gender1 = "g";
			} else {
				gender1 = "b";
			}

			counter += 1;

			if((gender1 != gender2) && (counter > 1)){
				break;

			}
		
			gender2 = gender1;

		
		} while (true);

			if (counter == 2){
				f2 ++;
			  } else {
			    if (counter == 3){
				f3 ++;
			  } else { 
			  	if (counter > 3){
				f4 ++;
				moreThen4 = moreThen4 + counter;
			}
		}
		}	
	}


	double average = ((double)((f2*2) + (f3*3) + (moreThen4))/ T);
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


	

