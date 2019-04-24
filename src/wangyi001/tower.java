package wangyi001;

import java.util.Scanner;

public class tower {
    static int[] value = new int[100];
    static int max=0;
    static int min=100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l1 = scanner.nextLine();
        String[] s1 = l1.split(" ");
        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        l1 = scanner.nextLine();
        String[] s2 = l1.split(" ");


        for (int i = 0; i < n; i++) {
            value[i] = Integer.parseInt(s2[i]);
        }
        for (int i = 0; i < k; i++) {
            int m=max(n);
            int mn =min(n);
            value[m]--;
            value[mn]++;
            System.out.print(m+1);
            System.out.println(" "+(mn+1));
            max(n);
            min(n);
            if((max== tower.min)&&(n>2)){
                System.out.println(0);
                return;
            }

        }
        System.out.println(max-min);


    }
    static int max(int n) {
        int  index = -1;
        max=0;
        for (int i = 0; i < n; i++) {
            if (max < value[i]) {
                index = i;
                max=value[i];
            }

        }

        return index;
    }
    static int min(int n) {
        min=10000;
        int  index = -1;

        for (int i = 0; i < n; i++) {
            if (min > value[i]) {
                index = i;
                min=value[i];

            }
        }
        return index;
    }
}
