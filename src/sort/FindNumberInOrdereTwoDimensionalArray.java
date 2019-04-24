package sort;

import sun.security.util.Length;

import java.util.concurrent.ForkJoinPool;

public class FindNumberInOrdereTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] a ={{1,2,3,5},{2,4,5,6},{3,9,10,12},{4,10,11,15}};
        boolean find=find(13,a);
        System.out.println(find);
    }

    private static boolean find(int i, int[][] a) {
        int m= a.length-1;
        int n= a[0].length-1;
        int x =n;
        int y=0;
        try {
            while(true) {
                if(a[y][x]==i)
                    return true;
                if (a[y+1][x] <= i){
                    y++;
                }
                else if (a[y][x-1] <= i){
                    x--;
                }
            }
        }
        catch (Exception e){
            return  false;
        }
    }



}
