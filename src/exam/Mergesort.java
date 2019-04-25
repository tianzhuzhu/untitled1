package exam;

import java.util.Arrays;

public class Mergesort {
    static void merge(int[] t, int left, int mid, int right){
        if(left==right)
            return;
        int len=right-left;
        int[] temp=new int[len];
        int i=left;
        int j=mid;
        int index=0;
        while ((i<mid)&&(j<right)){
            temp[index++]=t[i]<t[j]?t[i++]:t[j++];
        }
        while(i<mid)
            temp[index++]=t[i++];
        while(j<right)
            temp[index++]=t[j++];
        for (int k = 0; k < len; k++) {
            t[k+left]=temp[k];
        }
    }
    static void MergeSortRecursion(int t[],int left,int right){
        if(right-left<2)
            return ;
        int  mid=(left+right)/2;
        MergeSortRecursion(t,left,mid);
        MergeSortRecursion(t,mid,right);
        merge(t,left,mid,right);
    }
    public static void main(String[] args) {
        int[] a={11,2,9,4,5,7,7,4,12};
        int left=0,mid,right;
        for (int i = 1; i < a.length; i*=2) {
            left=0;
                while(left+i<a.length){
                    mid=left+i;
                    right=mid+i<a.length-1?mid+i:a.length-1;
                    merge(a,left,mid,right);
                    left=right;
                }
        }
        System.out.printf(Arrays.toString(a));
        int[] b={11,2,9,4,5,7,7,4,12,4,8};
        MergeSortRecursion(b,0,b.length);
        System.out.printf(Arrays.toString(b));
    }
}
