import java.util.Scanner;

public class towers {
	int moves = 0;
	
	 public void solve(int n, String start, String auxiliary, String end){
	       if (n == 1) {
	           System.out.println("Disk " + n + ": " + start + " -> " + end);
	           moves++;
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println("Disk " + n + ": " + start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	           moves++;
	       }
	      
	 }
	 public void moves(){
		 System.out.println(moves);
	 }
	 
}
