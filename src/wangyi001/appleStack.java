package wangyi001;

import com.sun.org.apache.bcel.internal.generic.JSR;
import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.management.resource.internal.TotalResourceContext;
import sun.awt.SunHints;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class appleStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l1 = scanner.nextLine();
        String[] s1 = l1.split(" ");
        int n = Integer.parseInt(s1[0]);
        l1 = scanner.nextLine();
        String[] s2 = l1.split(" ");
        l1 = scanner.nextLine();
        String[] s3 = l1.split(" ");
        l1 = scanner.nextLine();
        int m = Integer.parseInt(s3[0]);
        String[] s4 = l1.split(" ");

        int[] value = new int[n];
        int[] query = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = Integer.parseInt(s2[i]);
        }
        for (int i = 0; i < m; i++) {
            query[i] = Integer.parseInt(s4[i]);
        }
        int[] result= new int[m];
        for (int i = 0; i < m; i++) {
            int j=0;
            while(query[i]>0) {
                if(j==n)
                    break;
                query[i] -= value[j];
                j++;
            }
            result[i]=j;
            System.out.println(j);
        }
//        String s = Arrays.toString(result);
//
//        System.out.println(s);

    }
}
