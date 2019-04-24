package sort;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import sun.awt.windows.WPrinterJob;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class CombineOrderArray {
    public static void main(String[] args) {
        int[] a=new int[6];
        int[] b=new int[3];
       a[0]=1;a[1]=3;a[2]=5;b[0]=2;b[1]=4;b[2]=6;
        int i=a.length-1;
            int ai=b.length-1;
            int bi=b.length-1;
            while(ai>=0&&bi>=0)
            if(a[ai]>b[bi]) {
                a[i]=a[ai];
                i--;
                ai--;
            }
                else{
                a[i]=b[bi];
                i--;
                bi--;

            }
            while(ai>=0) {
                a[i] = a[ai];
                i--;
                ai--;
            }
            while(bi>=0) {
                a[i] = b[bi];
                i--;
                bi--;
            }
            System.out.println(Arrays.toString(a));
        }

}
