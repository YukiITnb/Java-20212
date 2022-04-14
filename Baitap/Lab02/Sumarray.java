import java.util.Scanner;
public class Sumarray{
    public static void main(String[] args){
        int n, sum = 0;
        float average;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number elements in array:");
        n = keyboard.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = keyboard.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}

