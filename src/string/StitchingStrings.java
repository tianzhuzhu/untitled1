package string;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.lang.model.element.NestingKind;
import java.util.concurrent.ForkJoinPool;

public class StitchingStrings {
    public static void main(String[] args) {
//        String a="ab";
//        String b="a";
//        a.compareTo(b);
        String[] a={"ab","aba","abd","ab","ac"};
        StitchingStrings(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public static void StitchingStrings(String[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if ((a[i]+a[j]).compareTo(a[j]+a[i])>0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=a[i];
                }
            }
        }
    }
}
