package OnlineProgram;

import java.math.BigInteger;
import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        long l = Long.parseLong(s);
        long end=(long) 1e18;
        ;
        System.out.println(halfSeek(0,end,l));
    }
    public static long caculate(long num){
        long sum=0;
        while(num>0){
            sum+=num;
         num=num/10;
        }
        return sum;

    }
    public static long halfSeek(long start,long end,long value){
        if(start==end){ return -1;}
        long mid =(start+end)/2;
        long sum = caculate(mid);
        if (sum==value)
            return mid;
        else if (sum<value)
           return halfSeek(mid+1, end, value);
        else
            return halfSeek(start, mid, value);

}
}
