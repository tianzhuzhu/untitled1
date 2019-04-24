package OnlineProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1{
    public static void main(String[] args){
        Scanner scancer=new Scanner(System.in);

        String a= scancer.nextLine();
        Set<Character> set=new HashSet<Character>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        int result=1;
        if(set.size()>2)
        {
            System.out.println("o");
            return;
        }
        for (int i = 1; i <=set.size(); i++) {
            result*=i;
        }
        System.out.println(result);
    }

}
