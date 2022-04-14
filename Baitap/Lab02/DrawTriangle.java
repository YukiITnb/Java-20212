import java.util.Scanner;
public class DrawTriangle{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input n:");
		int n = keyboard.nextInt();

		int i,j;

		for ( i=0 ; i<n ; i++ ) {
			for ( j = n-i ; j >1 ; j-- ) {
				System.out.print(" ");
				
			}

			for (j = 0; j<=i*2 ; j++ ) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
}