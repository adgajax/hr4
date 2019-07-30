import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary[] = new int[100];
        int i = 0;
        while(n>0){
            binary[i++] = n%2;
            n = n/2;
        }
        for(int j = i-1; j >= 0; j--){
            System.out.print(binary[j]);
        }
    }
}
