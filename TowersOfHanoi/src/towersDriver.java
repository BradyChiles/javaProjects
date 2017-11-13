import java.util.Scanner;

public class towersDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		towers towersOfHanoi = new towers();
	    System.out.print("Enter number of discs: ");
	    Scanner in = new Scanner(System.in);
	    int discs = in.nextInt();
	    towersOfHanoi.solve(discs, "Start", "Auxiliary", "End");
	    towersOfHanoi.moves();
	}
}
