import java.util.Scanner;
public class Soultion6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        for(int i = 2; i <= num/2; ++i) {
            if (num % i == 0) {
                System.out.print(i + "\t");
            }
        }
	 }
}
