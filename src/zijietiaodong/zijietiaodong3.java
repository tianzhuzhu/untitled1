package zijietiaodong;

import sun.plugin.viewer.frame.AxBridgeEmbeddedFrame;

import java.util.*;

public class zijietiaodong3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        String[] s1 = l.split(" ");
        int N=Integer.parseInt(s1[0]);
        int M=Integer.parseInt(s1[1]);
        Integer[] v= new Integer[N];
        l=scanner.nextLine();
         s1 = l.split(" ");
        for (int i = 0; i <v.length; i++) {
            v[i]=Integer.parseInt(s1[i]);
        }
        int count=0;
        List<Integer> list = Arrays.asList(v);
        Collections.sort(list);
        Integer max=list.get(list.size()-1);
        for (int i = max*N/M; i >0 ; i--) {
            int split=0;
            for (int j = 0; j <N ; j++) {
                split+=v[j]/i;

            }
            if(split>=M) {
                count=i;
                break;

            }

        }
        System.out.println(count);
    }
}
