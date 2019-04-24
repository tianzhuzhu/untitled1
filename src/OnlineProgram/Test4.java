package OnlineProgram;

import java.util.*;

public class Test4 {
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
        Deque<Integer> queue=new LinkedList<Integer>();
        List<Integer> list =new ArrayList<>();
        boolean t=true;
        for (int i = 0; i <N; i++) {
            if(i%2==0)
                queue.addLast(integers[i]);
            else
                queue.addFirst(integers[i]);

        };
        if(N%2==0)
        for (int i = 0; i < N; i++) {
            System.out.print(((LinkedList<Integer>) queue).get(i)+" ");
        }
        else
            for (int i = N-1; i >0; i--) {
                System.out.print(((LinkedList<Integer>) queue).get(i)+" ");
            }
    }
}
