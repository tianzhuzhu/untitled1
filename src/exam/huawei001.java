package exam;

import java.util.Scanner;

public class huawei001 {
    public static void main(String[] args) {
        Scanner scancer = new Scanner(System.in);
        String s = scancer.nextLine();
        String[] s1 = s.split(" ");
        int N = Integer.parseInt(s1[0]);
        s=scancer.nextLine();
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        String[] result= new String[N];
        for (int i = 0; i < N ; i++) {
            if(chars[i*9]=='1'){
                for (int j = i*9+1; j <(i+1)*9; j++) {
                    stringBuilder.append(chars[j]);
                }

            }
            else
            if(chars[i*9]=='0'){
                for (int j = (i+1)*9-1; j >=i*9+1; j--) {
                    stringBuilder.append(chars[j]);
                }

            }
            stringBuilder.append(" ");
        }
        System.out.printf(stringBuilder.toString());
    }
}
