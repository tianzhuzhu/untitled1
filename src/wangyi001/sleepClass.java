package wangyi001;

import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.management.resource.internal.TotalResourceContext;
import sun.awt.SunHints;

import java.util.Scanner;

public class sleepClass {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String l1 = scanner.nextLine();
        String[] s1 = l1.split(" ");
        int n = Integer.parseInt(s1[0]);
        int wake = Integer.parseInt(s1[1]);
        l1 = scanner.nextLine();
        String[] s2 = l1.split(" ");
        l1 = scanner.nextLine();
        String[] s3 = l1.split(" ");
        int[] value =new  int[n];
        int[] awake = new int[n];
        for (int i=0;i<n;i++) {
            value[i]=Integer.parseInt(s2[i]);
            awake[i]=Integer.parseInt(s3[i]);
        }
//        for (int k=0;k<n;k++){
        int total=0;
        for (int i=0;i<n;i++) {

            if(awake[i]==0) {
                int temp=0;
                for (int j = 0; (j < wake)&&(j+i<n); j++) {
                    if(awake[j+i]==0) {
                        temp += value[j + i];
                        System.out.println(temp);
                    }
                }
                total=Math.max(temp, total);
            }
        }
        for (int i = 0; i < n; i++) {
            if(awake[i]==1)
                total+=value[i];
        }
            System.out.println(total);
//        }
    }
}
