import java.io.*;
import java.util.*;

public class E1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size of Array: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum=0;
		System.out.println("Enter Array: ");
		for(int i =0;i<n;i++) {
			
			arr[i] = input.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		float avg = ((float)sum)/((float)n);
		System.out.println("Avarage: "+avg);
	}
}
