package OnlineProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        char[] c = s.toCharArray();
        int length = c.length;
        int[] a=new int[length +1];

        for (int i = 0; i < length+1; i++) {
            for (int j = 0; j <i; j++) {
                if(c[j]=='G')
                    a[i]++;
            }
            for (int j = i; j <length; j++) {
                if(c[j]=='R')
                    a[i]++;
            }
        }
        Arrays.sort(a);
        System.out.println(a[0]);

    }
}
