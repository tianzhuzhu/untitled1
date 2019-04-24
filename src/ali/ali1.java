package ali;
import com.sun.deploy.panel.ITreeNode;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ali1 {
    static String calculate(int m, int k) {
    int[] a=new int[4];
    int[] b=new int[100];

    b[0]=2;b[1]=3;b[2]=4;
        for (int i = 3; i < 100; i++) {
            b[i]=b[i-2]+b[i-3];
        }
        a[0]=k;
        int temp=0;
        for (int i = 0; i < 20; i++) {
            a[2]+=a[1];
            a[1]=a[0];
            a[0]=a[2];
            if(sum(a)>=m) {
                temp = i + 1;
                break;
            }

        }
        int biahao=b[m-1];
        int[] c=new int[m];
        for (int i = 0; i < m; i++) {
            StringBuilder stringBuilder =new StringBuilder(b[i]+"");
            String s = stringBuilder.reverse().toString();
            c[i]=Integer.parseInt(s) ;

        }
        Arrays.sort(c);
        StringBuilder stringBuilders = new StringBuilder(c[m-2-k]+"");
        int parseInt = Integer.parseInt(stringBuilders.reverse().toString());
        int temp2=0;
        for (int i = 0; i < m ; i++) {
            if(parseInt==b[i]){
                temp2=i;
                break;

            }
        }
    return biahao+","+(temp+2019)+","+temp2;
    }
    public static int sum(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);;
        System.out.println(calculate(m, k));

    }
}