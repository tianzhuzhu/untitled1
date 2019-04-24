package sort;

import sun.awt.windows.WPrinterJob;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class Radix {
    public static void main(String[] args) {
        int[] a ={1,3,11,22,44,55,777,21321,32142};
        radixSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void radixSort(int[] a){
        int[] b;
        Map<Integer,Queue<Integer>> map = new HashMap<Integer,Queue<Integer>>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new LinkedList<>());

        }

        int max= Arrays.stream(a).reduce((num1, num2) -> Math.max(num1, num2)).getAsInt();

        System.out.println(max);
        int count=0;
        for (int i = 0; i < 1000; i++) {
            count++;
            max=max/10;
            if(max==0)
                break;

        }
        for (int i = 0; i < count; i++) {
            b=a.clone();
            for (int j = 0; j <a.length ; j++) {
                int value =( b[j] / (int) (Math.pow(10, i)) )% 10;

                map.get(value).offer(b[j]);
            }
            int index=0;
            for (int j = 0; j < 10; j++) {

                Queue<Integer> integers = map.get(j);
                while(!integers.isEmpty())
                {
                    a[index++]=integers.poll();
                }
            }
        }

    }
    private static void radixSort(int[] array,int d)
    {
        int n=1;//代表位数对应的数：1,10,100...
        int k=0;//保存每一位排序后的结果用于下一位的排序输入
        int length=array.length;
        int[][] bucket=new int[10][length];//排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在同一个桶里
        int[] order=new int[length];//用于保存每个桶里有多少个数字
        while(n<d)
        {
            for(int num:array) //将数组array里的每个数字放在相应的桶里
            {
                int digit=(num/n)%10;
                bucket[digit][order[digit]]=num;
                order[digit]++;
            }
            for(int i=0;i<length;i++)//将前一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
            {
                if(order[i]!=0)//这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
                {
                    for(int j=0;j<order[i];j++)
                    {
                        array[k]=bucket[i][j];
                        k++;
                    }
                }
                order[i]=0;//将桶里计数器置0，用于下一次位排序
            }
            n*=10;
            k=0;//将k置0，用于下一轮保存位排序结果
        }

    }

}
