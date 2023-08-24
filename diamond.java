//Here we are printing the famous star diamond pattern
public class diamond {
	public static void main(String[] args){
		int n = 7;
        int i,j;

		// This part prints the first half diamond
		for (i= 1; i <= n; i++) { 

			for (j = 1; j<= n-i; j++) {   //prints spaces        //note if j<=n-1 it gives distorted diamond
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {  //star prinitng
				System.out.print("*");
			}
			System.out.println();
		}

		// This  lower part Prints the second half diamond
		for (i = n - 1; i > 0; i--) {

			for (j = 1; j <= n - i; j++) {   //for spaces
				System.out.print(" ");
			}
			for (j = 1; j <= i * 2 - 1; j++) {   //for printing stars 
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
