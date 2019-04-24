package sort;

import com.sun.deploy.security.SecureStaticVersioning;
import com.sun.javafx.image.BytePixelSetter;
import jdk.internal.dynalink.beans.StaticClass;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] ={3,1,4,5,7,2,4,5,6};
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void merge(int[] a, int low, int high){
        int[] k =new int[high-low+1];

        int mid=(high+low)/2;
        int i=low;
        int j=mid+1;
        int index=0;
        while((i<=mid)&&(j<=high)){
            if(a[i]<=a[j]){
                k[index++]=a[i++];
            }
            else k[index++]=a[j++];
        }
        while(i<=mid)
            k[index++]=a[i++];
        while(j<=high)
            k[index++]=a[j++];
        for (int l = 0; l <high-low+1; l++) {
            a[l+low]=k[l];
        }

    }
    public static void mergeSort(int[] a,int low,int high ){
        if((a==null)||(low>=high)||(a.length==0))
        return;
        int mid =(low+high)/2;
        mergeSort(a,low,mid );
        mergeSort(a, mid+1, high);
        merge(a,low,high);
    }
}
