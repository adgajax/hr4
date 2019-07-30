import java.util.Scanner;
import java.math.*;
public class Solution4 {
	static boolean isPowerOfTwo(int n) { 
	if(n==0) 
	return false; 
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
} 
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(isPowerOfTwo(n)) 
			System.out.println("True"); 
		else
			System.out.println("False"); 
	} 
} 
