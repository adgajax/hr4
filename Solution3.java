import java.util.Scanner;
class Solution3 { 
	static int gcd(int a, int b) { 
		if (a == 0 || b == 0) 
			return 0; 
		if (a == b) 
			return a; 
		if (a > b) 
			return gcd(a-b, b); 
		return gcd(a, b-a); 
	} 
	static void relprime(int a, int b) { 
		if (gcd(a, b) == 1) 
			System.out.println("Yes"); 
		else
			System.out.println("No");	 
	} 
	public static void main (String[] args) { 
        Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt(); 
		relprime(a, b); 
	} 
}
