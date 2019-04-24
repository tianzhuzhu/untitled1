package sort;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.List;

public class Quicksort {
    public static void main(String[] args){
        int [] n = {1,3,9,11,12,4,6,7,5};
        quickSort(n, 0,n.length-1);
        String s = Arrays.toString(n);
//        System.out.println(list.toString());

        System.out.println(s);
    }




    public static void quickSort(int[] n, int left,int right) {
        if (left >= right)
            return;
        int temp;
        int key = n[left];
        int i = left;
        int j = right;
        while (i < j) {
            while ((key >= n[j]) && (i < j))
                j--;
            while ((key <= n[i]) && (i < j))
                i++;
            if (i < j) {
                temp = n[i];
                n[j] = n[i];
                n[i] = temp;
            }
            n[left] = n[i];
            n[i] = key;
            quickSort(n, left, i - 1);
            quickSort(n, i + 1, right);
        }
    }

}
