package wangyi001;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Arrays;
import java.util.Scanner;

public class caculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l1 = scanner.nextLine();
        String[] s = l1.split(" ");
        int total=0;
        int[] value = new int[3];
        int[] is1 = new int[3];
         is1 = Arrays.stream(is1).map(a -> 0).toArray();
        for (int i = 0; i < 3; i++) {
            value[i] = Integer.parseInt(s[i]);
            if(value[i]==1)
                is1[i]=1;
            total+=1;
        }
        if(total==0)
            System.out.println(value[0]*value[1]*value[2]);
        if(total==1){
            int max = Math.max((value[0] + value[1]) * value[2], value[0] * (value[2] + value[1]));
            System.out.println(max);

        }
        if(total>=2) {
            int max = Math.max((value[0] + value[1]) * value[2], value[0] * (value[2] + value[1]));
            max=Math.max((value[0] + value[1]) + value[2], max);
            System.out.println(max);
        }




    }
}
