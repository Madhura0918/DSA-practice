//Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.


package Array;
import java.util.Scanner;
public class ArrayQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		
		boolean isAscending=true;
		for(int i =0;i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {
				isAscending=false;
			}
		}
		
		if(isAscending) {
			System.out.println("The array is sorted in ascending order");
		}else {
			System.out.println("The array is not sorted in ascending order");
		}
		
		sc.close();
	}

}
