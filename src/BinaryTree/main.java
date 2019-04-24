package BinaryTree;
public class main {
    static  int[] a={-1,-1};
    public static void main(String[] args) {
        int[] integers ={1,2,2,3,4,4,4,5};
        int tofind=4;
        int first=-1,last=-1;
       find(0,integers.length-1,integers,tofind,0);
        System.out.println(a[0]+""+a[1]);
    }
    static  void find(int low,int high,int[] arr,int tofind,int k){
//        int temp=((int)Math.ceil((double) low+high)/2);
        int temp=(low+high)/2;
        if(temp<=low||temp>=high)
            return;
        if (arr[temp]==tofind){
            if(a[0]==-1){a[0]=temp;}
            if(a[1]==-1){a[1]=temp;}
        if(k==-1||k==0) {
            find(temp , high, arr, tofind,-1);
        }
        if(k==1||k==0) {
            find(low, temp - 1, arr, tofind,1);
        }
            a[0]=Math.min(temp,a[0]);
            a[1]=Math.max(temp, a[1]);
        }
        if (arr[temp]<tofind&&a[0]==-1){
            find(temp,high, arr,tofind,0);
        }
        else if (arr[temp]>tofind&&a[1]==-1){
            find(low,temp-1, arr,tofind,0);
        }



    }
}
