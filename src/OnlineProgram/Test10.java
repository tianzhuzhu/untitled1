package OnlineProgram;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);
        s = scanner.nextLine();
        s1 = s.split(" ");
        Integer[] a=new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i]=Integer.parseInt(s1[i]);
        }

        for (int i = 0; i < K; i++) {
            Integer[] b=a.clone();
            for (int j = 0; j < N/2-1; j++) {
                a[2*i]=b[i];
                a[2*i+1]=b[i+N/2];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
