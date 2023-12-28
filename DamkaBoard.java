/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
       
       int a = Integer.parseInt(args[0]);

       for (int i = 1; i <= a; i ++){
       	for (int j = 1; j <= a; j ++){

       		if((i % 2) == 1){
       		   System.out.print("* ");
       	    } else {
       		   System.out.print(" *");
        	}
       		
        } 
       	    System.out.println();
   	    }   
    }
}
