package zijietiaodong;


import com.sun.xml.internal.ws.api.pipe.NextAction;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class zijietiaodongexam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int n1 = Integer.parseInt(ss[0]);
        int[] score=new int[n1];
        for (int i = 0; i <n1 ; i++) {
            score[i]=0;
             s = scanner.nextLine();
             ss = s.split(" ");
            int n2 = Integer.parseInt(ss[0]);
            s = scanner.nextLine();
            ss = s.split(" ");
            Integer[] v= new Integer[n2];
            Integer[] giftarray=new Integer[n2];
            for (int j = 0; j <n2; j++) {
                v[j]=Integer.parseInt(ss[j]);
                giftarray[i]=0;
            }
            getOne(v, giftarray);
            List<Integer> gift = Arrays.asList(giftarray.clone());
            List<Integer> indexOfone=new ArrayList<>();
            indexOfOne(gift,indexOfone);

//            gift.stream().map(ab->{System.out.println(ab);return ab;});
            for (int j = 0; j <indexOfone.size() ; j++) {

                int down =indexOfone.get(j);
                int up=indexOfone.get(inboud(j+1, indexOfone.size()));
               if(up-down==1)
                   continue;;
               if(up-down==-1)
                   continue;
               complete(giftarray, v, down, up);

            }
            for (int j = 0; j <n2 ; j++) {
                score[i]+=giftarray[j];
//                System.out.print(giftarray[i]);
            }

        }
        for (int i = 0; i < n1; i++) {
            System.out.println(score[i]);
        }

    }
    public static  Integer inboud(int index,int size){
        if(index<0)
            index=size+index;
        if(index>=size)
            index=-size+index;
        return index;
    }
    public static void indexOfOne(List<Integer> gift,List<Integer> indexOfone)
    {
        int index;
        while (gift.indexOf(1)!=-1){
            index=gift.indexOf(1);
            indexOfone.add(index);
            gift.set(index , -1);
        }

    }
    public static void getOne(Integer[] v,Integer[] giftArray)
    {
        int size=v.length;
        for (int i = 0; i <size; i++) {
          int last=inboud(i-1, size)  ;
          int next=inboud(i+1, size);
          if((v[last]>=v[i])&&(v[next]>=v[i])){
              giftArray[i]=1;
          }
        }
    }
    public static void complete(Integer[] gift,Integer[] v,int down ,int up){
        int size=gift.length;
        int off=inboud(up - down - 1, v.length);
        for (int i = 0; i < off; i++) {
            if(v[inboud(down+i+1,size)]<=v[inboud(down+i,size)]){
                break;
            }
            gift[inboud(down+i+1,size)]=gift[inboud(down+i,size)]+1;

        }
        for (int i = 0; i < off; i++) {
            if(v[inboud(up-i-1,size)]<=v[inboud(up-i,size)]){
                gift[inboud(up-i,size)]=Math.max(gift[inboud(up-i-1,size)]+1,gift[inboud(up-i,size)]);
                break;
            }
            gift[inboud(up-i-1,size)]=gift[up-i]+1;

        }
    }

}
