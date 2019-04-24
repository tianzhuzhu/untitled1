package sort;

import sun.security.util.Length;

import java.util.Arrays;

public class NeedSort {
    public static void main(String[] args) {
        int[] a={1,4,7,9,10,12,4,20};
        Needsort(a);
//        System.out.println(Arrays.toString(a));
    }

    private static void Needsort(int[] a) {
        int left=a.length-1;
        int right=0;
        int max,min;
        max=a[0];min=a[a.length-1];
        for (int i = 1; i < a.length; i++) {
            max=Math.max(a[i],max);
            if(a[i]<max)
                right=i;
        }
        min=a[a.length-1];
        for (int i = a.length-1; i > 0; i--) {
            max=Math.min(a[i],max);
            if(a[i]>max)
                left=i;
        }
        int[] c=new int[right-left+1];
        for (int i=left;i<=right;i++)
             c[i-left]=a[i];

        System.out.println(Arrays.toString(c));
        a=c.clone();
    }
}
