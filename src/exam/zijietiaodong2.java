package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zijietiaodong2 {
    public static void main(String[] args) {
        Scanner scancer = new Scanner(System.in);
        String s1 = scancer.nextLine();
        String[] l1 = s1.split(" ");
        int i1 = Integer.parseInt(l1[0]);
        String[] s =new String[i1];
        for (int i = 0; i<i1 ; i++) {
            s[i] = scancer.nextLine();
        }


        for (int j = 0; j <i1 ; j++) {
            char[] chars = s[j].toCharArray();
            List<Character> cha=new ArrayList<>();
            for (int i = 0; i <chars.length ; i++) {
                cha.add(chars[i]);
            }


            int n=cha.size();
            for (int i = 0; i <n ; i++) {


                if ((i<cha.size()-2)&&(cha.get(i)==cha.get(i+1)&&(cha.get(i+1)==cha.get(i+2))))
                {
                    cha.remove(i+2);
                    i=i-1;

                }
                else if ((i<cha.size()-3)&&(cha.get(i)==cha.get(i+1)&&(cha.get(i+2)==cha.get(i+3))))
                {
                    cha.remove(i+3);
                    i=i-1;

                }
            }
            for (int i = 0; i <cha.size() ; i++) {
                System.out.print(cha.get(i));

            }
            if (j!=i1-1)
                System.out.println("");
        }

//        String s1 = chars.();



    }
}
