package OnlineProgram;

import java.util.Scanner;

public class TEST11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int N = Integer.parseInt(s1[0]);
        Integer[] X=new Integer[N];
        Integer[] Y=new Integer[N];
        for (int i = 0; i < N; i++) {
            s = scanner.nextLine();
            s1 = s.split(" ");
            X[i]=Integer.parseInt(s1[0]);
            Y[i]=Integer.parseInt(s1[1]);
        }
        int sum=0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    sum+=check(X[i],Y[i],X[j],Y[j],X[k],Y[k]);
                }
            }
        }
        System.out.println(sum);
    }

    private static int check(Integer x, Integer y, Integer x1, Integer y1, Integer x2, Integer y2) {
        if((y2-y)*(x1-x)==(y1-y)*(x2-x))
            return 0;
        else return 1;
    }
}
