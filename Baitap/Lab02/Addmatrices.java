import java.util.Scanner;
public class Addmatrices{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int row,col,i,j;

		System.out.println("Input number of rows of matrix");
      	row = keyboard.nextInt();
      	System.out.println("Input number of columns of matrix");
      	col  = keyboard.nextInt();

      	int array1[][] = new int[row][col];
      	int array2[][] = new int[row][col];
      	int sum[][] = new int[row][col];

      	System.out.println("Input elements of first matrix");
 
      	for (i = 0 ; i < row ; i++)
         	for (j = 0 ; j < col ; j++)
            	array1[i][j] = keyboard.nextInt();

        System.out.println("Input elements of second matrix");

        for (i = 0 ; i < row ; i++)
         	for (j = 0 ; j < col ; j++)
            	array2[i][j] = keyboard.nextInt();

        for (i = 0 ; i < row ; i++)
         	for (j = 0 ; j < col ; j++)
             	sum[i][j] = array1[i][j] + array2[i][j]; 

        System.out.println("Sum of the matrices:-");
 
      	for (i = 0 ; i < row ; i++){
      		for (j = 0 ; j < col ; j++)
            	System.out.print(sum[i][j]+"\t");
 			
 			System.out.println();
      	}


	}
}