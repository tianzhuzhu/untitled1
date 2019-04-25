package exam;

import java.util.Scanner;

public class huawei003 {
    public static void main(String[] args) {
        Scanner scancer = new Scanner(System.in);
        String s = scancer.nextLine();
        int n = Integer.parseInt(s);
        String[] s1 = s.split(" ");
        Integer[] x = new Integer[n];
        Integer[] y = new Integer[n];
        int[][] a = new int[40][50];
        for (int i = 0; i < n; i++) {
            s = scancer.nextLine();
            s1 = s.split(" ");
            x[i] = Integer.parseInt(s1[0]);
            y[i] = Integer.parseInt(s1[1]);
            a[x[i]][y[i]] = 1;
        }
        int c=0;
        int finalResult=1000;
        for (int k = 0; k < 100; k++) {
     ;
        for (int i = 0; i < n; i++) {
            int x1=(i+k)%n;
            int y1=(i+k)%n;
            if (a[x[x1]][y[y1]] == 1) {
                int num = check(x[x1], y[y1], a);
                change(x[x1], y[y1], a, num);
                c++;
            }

        }

            finalResult= Math.min(c,finalResult);
        }
        System.out.printf(c+"");
    }

    public static void change(int i, int j, int[][] a, int dest) {
        int result = 0;
        int temp = 0;
        int num = 0;
        int x = i;
        int y = j;
        if (dest == 1) {
            x = 0;
            while (x < 40) {
                a[x][y] = 0;
                x++;
            }
        }
        if (dest == 2) {
            x = i;
            y = 0;

            while (y< 50) {
                a[x][y] = 0;
                y++;
            }
        }
        if (dest == 3) {
            x = i;
            y = j;
            x -= Math.min(i, j);
            y -= Math.min(i, j);
            while ((x < 40) && (y< 50)) {
                a[x][y] = 0;
                x++;
                y++;
            }

        }
        if(dest==4){
            x += Math.min(40-i-1, j);
            y -= Math.min(40-i-1, j);
            while ((x>= 0) && (y< 50)) {
                a[x][y] = 0;
                x--;
                y++;

            }

        }
    }
        public static int check ( int i, int j, int[][] a){

            int result = 0;
            int temp = 0;
            int num = 0;
            int x = i;
            int y = j;

            x = 0;
            while (x < 40) {
                if (a[x][y] == 1)
                    temp++;
                x++;
            }
            if (result <= temp) {
                result = temp;
                num = 1;
            }
            temp = 0;
            x = i;
            y = j;
            x -= Math.min(i, j);
            y -= Math.min(j, j);
            while ((x<40) && (y< 50)) {
                if (a[x][y] == 1)
                    temp++;
                x++;
                y++;
            }
            if (result <= temp) {
                result = temp;
                num = 3;
            }
            temp = 0;
            x = i;
            y = 0;
            while (y< 50) {
                if (a[x][y] == 1)
                    temp++;
                y++;
            }
            if (result <= temp) {
                result = temp;
                num = 2;
            }
            temp = 0;
            x = i;
            y = j;
            x += Math.min(40-i-1, j);
            y -= Math.min(40-i-1, j);
            while ((x>= 0) && (y< 50)) {
                if (a[x][y] == 1)
                    temp++;
                x--;
                y++;
            }
            if (result <= temp) {
                result = temp;
                num = 4;
            }

            return num;

        }
}

