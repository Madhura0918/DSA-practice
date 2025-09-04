// Q3 Find the maximum & minimum number in an array of integers. 

package Array;
import java.util.Scanner;
public class ArrayQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int numbers[]=new int[size];
		
		for(int i =0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
			
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("Minimum number is "+min);
		System.out.println("Maximum number is "+max);
		
		sc.close();
	}

}




