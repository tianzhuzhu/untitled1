package exam;

public class topk {
    public static void main(String[] args) {
        int[] a={11,2,9,4,5,7,7,4,12,4,8,6,3,2};
        int k=5;
        int c=findInArray(a,a.length-k-1,0,a.length - 1);
        System.out.printf(c+"");
    }
    public static int  findInArray(int[] a,int k,int low,int high){
        if(k>a.length-1)
            return -1;

        int partition = partition(a, k, low,high );
        if(partition==k)
                return partition;
        else if(partition>k)
            partition(a,k,low,partition-1);
        else
            partition(a,k,partition+1,high);

        return partition;
    }
    public static int partition(int[] a,int k,int low ,int high){
        int i=low,j=high;
        int temp=a[k];
        while(i<j){
            while((a[j]<temp)&&(i<j))
                j--;
            while((a[i]<temp)&&(i<j))
                i++;
            int z=a[i];
            a[i]=a[j];
            a[j]=z;
        }
        a[low]=a[i];
        a[i]=temp;
        return i;
    }

}
