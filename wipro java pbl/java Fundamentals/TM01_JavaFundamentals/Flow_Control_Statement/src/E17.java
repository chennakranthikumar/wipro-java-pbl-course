import java.io.*;
import java.util.*;

public class E17 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter an Integer: ");
		int num = input.nextInt();
		String s1 = String.valueOf(num);
		String result="";
		for(int i=s1.length()-1;i>=0;i--) {
			result+=s1.charAt(i);
		}
		System.out.println(Integer.parseInt(result));
	}
}
