package sort;

import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class HeapSort {

    private static int[] buildMaxHeap(int[] array){
        for(int i=(array.length-2)/2;i>=0;i--){
            adjustDownToUp(array, i,array.length);
        }
        return array;
    }
    private static int[] buildMinHeap(int[] array,int k){
        for(int i=(k-2)/2;i>=0;i--){
            adjustUpToDown(array, i,k);
        }
        return array;
    }

    //最小堆排序
    private static void adjustUpToDown(int[] array, int k, int length){
        int temp = array[k];
        int c=k;
        for(int i=1; i<length; i=2*i+1){
            if(array[i+k]>array[i+1+k]){
                i++;
            }
            if(temp<=array[i+k]){
                break;
            }else{
                array[c] = array[i+k];
                c = i+k;
            }
        }
        array[c] = temp;
    }
    private static void adjustDownToUp(int[] array, int k, int length){
        int temp = array[k];
        for(int i=2*k+1; i<length-1; i=2*i+1){
            if(i<length && array[i]<array[i+1]){
                i++;
            }
            if(temp>=array[i]){
                break;
            }else{
                array[k] = array[i];
                k = i;
            }
        }
        array[k] = temp;
    }
    //堆排序
    public static int[] heapSort(int[] array){
        array = buildMaxHeap(array);
        for(int i=array.length-1;i>1;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            adjustDownToUp(array, 0,i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a= new int[]{3,5,7,9,8,8,4,2, 2, 1, 4, 6, 1, 3, 5};
        heapSort(a);
        System.out.println(Arrays.toString(a));
        int [] b=new int[20];
        b[0]=1;
        b[1]=10;
        b[2]=20;
        int[] max=new int[20];
        b[3]=5;
        for (int i =4 ;i<b.length;i++){
            b[i]= (int) (max(b,i-2)+ Math.random()*5);

        }
        System.out.println(Arrays.toString(b));
        AllmostHeampSort(b,3);
        System.out.println(Arrays.toString(b));
    }

    private static int max(int[] b, int i) {
        int max=b[0];
        for (int j = 1; j < i; j++) {

            max=Math.max(b[j],max);
        }
        return max;
    }
    private  static void AllmostHeampSort(int [] b,int k){
        buildMinHeap(b, 3);
        for (int i=0;i<b.length-3;i++){
            adjustUpToDown(b, i, 3);
        }
//        Queue<Integer> queue =new PriorityQueue<Integer>();

    }
}
