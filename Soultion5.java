import java.util.Scanner;
public class Soultion5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ocNum = {0, 1, 10, 11, 100, 101, 110, 111};
		long num, temp, bin, ptr;
		int r;
		num = in.nextLong();
		temp = num;
		bin = 0;
		ptr = 1;
		while (temp != 0){
			r = (int)(temp % 10);
			bin = ocNum[r] * ptr + bin;
			temp /= 10;
			ptr *= 1000;
		}
        String formatted = formatted = String.format("%09d",bin);
		System.out.print(formatted);
	 }
}
