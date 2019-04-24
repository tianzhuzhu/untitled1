package OnlineProgram;


import java.util.Arrays;
import java.util.Scanner;


public class Test5 {
    public static void main(String[] args) {
        Scanner scancer=new Scanner(System.in);
        String a= scancer.nextLine();

        String[] s = a.split(" ");
        Integer[] integers =new  Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            integers[i] = Integer.parseInt(s[i]);
        }
        if(a.length()<=3) {
            System.out.println(integers[0] * integers[1] * integers[2]);
            return;
        }
        for (int i = 0; i <s.length; i++) {
            int temp;
            if (integers[0]>integers[i])
                swap(integers,i,0);

            if (integers[1]>integers[i])
                swap(integers,i,1);

            if((integers[i]>integers[ s.length-1])&&(i<s.length-1)){
                swap(integers,i, s.length-1);

            }
            if(integers[i]>integers[ s.length-2]&&(i<s.length-2)){
                swap(integers,i, s.length-2);
            }
            if((integers[i]>integers[ s.length-3])&&(i<s.length-3))
            {
                swap(integers,i, s.length-3);

            }

        }
        System.out.println(integers[0] * integers[1] * integers[s.length - 1]);
        System.out.println(integers[ s.length-2]*integers[ s.length-3]*integers[ s.length-1]);
        System.out.println(Math.max(integers[0] * integers[1] * integers[s.length - 1],integers[ s.length-2]*integers[ s.length-3]*integers[ s.length-1]));

    }
    public static void swap(Integer[] a,int i,int j
    ){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
