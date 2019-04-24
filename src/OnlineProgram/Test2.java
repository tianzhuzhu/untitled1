package OnlineProgram;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scancer=new Scanner(System.in);
        String a= scancer.nextLine();
        int N = Integer.parseInt(a);
        a=scancer.nextLine();
        String[] s = a.split(" ");
        Integer[] integers =new  Integer[N];
        for (int i = 0; i < N; i++) {
            integers[i] = Integer.parseInt(s[i]);
        }
        List<Integer> list = Arrays.asList(integers);
        Collections.sort(list);
        Integer min = list.get(0);
        Integer max = list.get(list.size() - 1);
        Integer d=(max-min)/(list.size()-1);
        int i=0;
        for (i = 0; i < list.size()-1; i++) {
            if((list.get(i)+d)!=list.get(i+1)) {
                break;

            }
        }
        if(i==list.size()-1)
            System.out.println("Possible");
        else
            System.out.println("Impossible");


    }
}
