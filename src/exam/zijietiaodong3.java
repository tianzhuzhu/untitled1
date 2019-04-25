package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zijietiaodong3 {
    public static void main(String[] args) {
        Scanner scancer = new Scanner(System.in);
        String s = scancer.nextLine();
        String[] s1 = s.split(" ");
        int n1 = Integer.parseInt(s1[0]);
        s = scancer.nextLine();
        s1 = s.split(" ");
        int n2 = Integer.parseInt(s1[0]);
        Integer[][] v=new Integer[n1][n2];
        for (int i = 0; i <n1 ; i++) {
            s = scancer.nextLine();
             s1 = s.split(" ");
            for (int j = 0; j <n2; j++) {
                v[i][j]=Integer.parseInt(s1[j]);
            }
        }

        for (int i = 0; i <v[i].length ; i++) {
            Integer[] c= v[i];
            List<Integer> list = Arrays.asList(c);
            Integer gift[] = new Integer[list.size()];
            List<Integer> g1 = Arrays.asList(gift);
            List<Integer> io1 =new ArrayList<Integer>();
            while (g1.indexOf(0)==-1) {
                check(i, list,gift);
                get(io1,g1);
                for (int j = 0; j < io1.size(); j++) {
                    Integer down = io1.get(j);
                    go(j,io1.size());
                    Integer up = io1.get(go(j + 1, io1.size()));
                    if(down<up){

                    }
                    if(down>up){

                    }

                }
            }
        }

 }

    private static int go(int j, int size) {
        if(j+1==size)
            j=0;
        if(j==-1)
            j=size-1;
        return j;
    }


    private static void get(List<Integer> io1,List<Integer> g1) {
        while(g1.indexOf(1)!=-1){
            int i1 = g1.indexOf(1);
            g1.set(i1,-1);
            io1.add(i1);
        }

    }


    public static void check(int i,List<Integer> v,Integer[] gift){

        int n=v.size()-1;
        if(i==0){
            if((v.get(n)>=v.get(i))&&(v.get(i+1)>=v.get(i)))
                gift[i]=0;
        }
        else  if(i==n){
            if((v.get(i-1)>=v.get(i))&&(v.get(0)>=v.get(i)))
                gift[i]=0;
        }
        else{
            if((v.get(i-1)>=v.get(i))&&(v.get(i+1)>=v.get(i)))
                gift[i]=0;
        }
    }



}
