package wangyi001;

import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage_1_0;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.Scanner;

public class block {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String l1 = scanner.nextLine();
        String[] s1 = l1.split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        String l2 = scanner.nextLine();
        String[] s2 = l2.split(" ");
        int[] result =new int[n];
        result = Arrays.stream(result).map(s -> s = 0).toArray();
        for (int i=0;i<m;i++) {
            int value = Integer.parseInt(s2[i])-1;
//            System.out.println(value);
            result[value]++;
        }
        int score=100;
        for (int i=0;i<n;i++){
            score=Math.min(score, result[i]);
        }
        System.out.println(score);
    }
}
