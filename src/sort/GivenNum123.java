package sort;

import java.util.Arrays;

public class GivenNum123 {
    public static void main(String[] args) {
        int [] a={1,2,0,2,1,0,2,0,1,2,1,0};
        givenNum123Sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void givenNum123Sort(int[] a){
        int min=0,max=a.length;
        for (int i=0;i<max;i++){
            if(a[i]==0){
                exchange(a,i,min);
                min++;
            }
            else if(a[i]==2) {
                max--;
                exchange(a, i, max);

                i--;
            }

        }
    }

    private static void exchange(int[] a, int i, int index) {
        int temp;
        temp=a[i];
        a[i]=a[index];
        a[index]=temp;

    }
}
