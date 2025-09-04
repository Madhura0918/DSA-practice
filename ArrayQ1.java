//Q Take an array as input from the user. search for a given number X and print the index at which it occurs  
package Array;
import java.util.Scanner;
public class ArrayQ1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.print("Enter a size of array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		
		int numbers[] = new int[size];
		
		for(int i =0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number to find ");
		int x=sc.nextInt();
		
//		for(int i =0;i<size;i++)
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i]==x) {
				System.out.println("X found at index "+i);
			}
		}
		
		sc.close();
	}

}
