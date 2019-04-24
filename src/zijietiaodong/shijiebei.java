//package zijietiaodong;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.zip.CheckedOutputStream;
//
//public class shijiebei {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String l = scanner.nextLine();
//        String[] s1 = l.split(",");
//        int M=Integer.parseInt(s1[0]);
//        int N=Integer.parseInt(s1[1]);
//        int[][] value=new int[M][N];
//        int[][] group=new int[M][N];
//        int[] count= new int[M*N];
//        int que=0;
//        for (int i = 0; i <M; i++) {
//            l = scanner.nextLine();
//            s1 = l.split(",");
//            for (int j = 0; j <N; j++) {
//                value[i][j]=Integer.parseInt(s1[j]);
//                group[i][j]=0;
//                count[i*N+j]=0;
//            }
//        }
//
//        for (int i = 0; i <M; i++) {
//            for (int j = 0; j <N; j++) {
//                if(value[i][j]>0){
//                int check = check( value, group, i, j, N);
//                if(check==0){
//                    group[i][j]=que;
//                    count[que]++;
//                    que++;
//                }
//                else if(check==-1){
//                    que--;
//                }
//                else
//                {
//                    group[i][j]=check;
//                    count[check]++;
//                }
//            }
//            }
//        }
//        System.out.print(que-1);
//        System.out.println(" "+ Arrays.stream(count).reduce((a, b)->Math.max(a, b)));
//
//    }
//
//    public static int check(int[][] value,int[][] group,int i,int j,int N){
//        if(i>0){
//            if((j>0) &&(value[i-1][j-1]>0)&&(j<N-1)&&(value[i-1][j+1]>0)&&(value[i-1][j]==0)
//                return -1;
//            if((j>0) &&(value[i-1][j-1]>0))
//                return group[i-1][j-1];
//            if((value[i-1][j]>0))
//                return group[i-1][j];
//            if ((j<N-1)&&(value[i-1][j+1]>0))
//                return group[i-1][j+1];
//        }
//        if((j>0)&&(value[i][j-1]>0))
//            return group[i][j-1];
//
//        return 0;
//    }
//}
////10,10
////0,0,0,0,0,0,0,0,0,0
////0,0,0,1,1,0,1,0,0,0
////0,1,0,0,0,0,0,1,0,1
////1,0,0,0,0,0,0,0,1,1
////0,0,0,1,1,1,0,0,0,1
////0,0,0,0,0,0,1,0,1,1
////0,1,1,0,0,0,0,0,0,0
////0,0,0,1,0,1,0,0,0,0
////0,0,1,0,0,1,0,0,0,0
////0,1,0,0,0,0,0,0,0,0
