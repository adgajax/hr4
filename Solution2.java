import java.util.Scanner;
class DecToHex {
    Scanner scan = new Scanner(System.in);
	int num,n;
	String s1,s2;
	void modVal() {
		s1 = scan.nextLine();
		n = Integer.parseInt(s1);
		if(n>0){
			s2 = Integer.toBinaryString(n);
			num = Integer.parseInt(s2,2);
		}
	    else{
			num = Integer.parseInt(s1,2);
		}
	}
	void convert() {
		String hexa = Integer.toHexString(num);
		System.out.println(hexa);
	}
}
class Solution2 {
	public static void main(String... q) {
	DecToHex obj = new DecToHex();
	obj.modVal();
	obj.convert();
	}
}
