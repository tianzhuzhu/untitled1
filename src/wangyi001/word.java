package wangyi001;

import sun.awt.KeyboardFocusManagerPeerImpl;
import sun.awt.windows.WPrinterJob;

import java.io.PrintWriter;

public class word {
    public static void main(String[] args){
        long k=7,n=5,m=3;
        long value=0;
        StringBuffer stringBuffer = new StringBuffer();
        while((m>0)&&(n>0)){
//        while(k>1){
            value=count(n, m, k);
            if(k<=value) {
                n--;
                stringBuffer.append("a");
//                System.out.print("a");
            }
            else{
                m--;
//                System.out.print("n");
                k-=value;
                stringBuffer.append("z");
            }

        }
        while ((n--)>0) stringBuffer.append("a");
        while ((m--)>0) stringBuffer.append("z");
        System.out.println(stringBuffer);
    }
    public static long count(long n,long m,long k){
        long count=1;
        for (int i = 0; i < n - 1; i++) {//求组合数
            count *= n - 1 + m - i;
            count /= (i + 1);
            if (count > k)break;//防止越界。count>k就可以退出计算了
        }
        return count;
    }
}
