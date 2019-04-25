package exam;

import java.util.Scanner;

public class zijietiaodong1 {
    public static void main(String[] args) {
        Scanner scancer = new Scanner(System.in);
        String s = scancer.nextLine();
        String[] s1 = s.split(" ");
        int i1 = 1024-Integer.parseInt(s1[0]);
        int count=0;
        int j=i1/64;
        int k = (i1-j*64)/16;
        int l = (i1-j*64-k*16)/4;
        int m=i1-j*64-k*16-l*4;
        count=+j+k+m+l;
        System.out.println(count);
            }





    }
