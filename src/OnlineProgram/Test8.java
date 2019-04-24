package OnlineProgram;

import java.math.BigInteger;
import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        BigInteger sum=new BigInteger("0");


        for (int j = 0; j < chars.length; j++) {
            int length = chars.length-j;

            for (int i = 0; i < length; i++) {
                BigInteger integer=new BigInteger("10");
                BigInteger pow = integer.pow(chars.length-1-i);

                BigInteger multiply = pow.multiply(new BigInteger(Character.toString(chars[i])));
                sum = sum.add(multiply);

            }

        }
        System.out.println(sum);
    }
}
