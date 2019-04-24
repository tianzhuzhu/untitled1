package string;

import javax.swing.*;
import java.util.jar.JarEntry;

public class ReverseWord {
    public static String reverse(String a,int first,int last){
        int i=first,j=last;
        char[] chars = a.toCharArray();
        while(i<j){
            char temp;
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
       return new String(chars);

    }

    public static void main(String[] args) {
        String a="abcdefgh abc adv bca adb";
        char[] chars = a.toCharArray();
        int[] index=new int[chars.length];
        int j=0;
        for (int i = 0; i < chars.length; i++) {
          if(chars[i]==' ');
          index[j]=i;
          j++;
        }

        String reverse = reverse(a, 0, a.length() - 1);
        for (int i = 0; i < j-1; i++) {
            reverse(a,index[i]+1,index[i+1]-1);
        }
        System.out.println(reverse);
    }
}
