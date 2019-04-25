package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei002 {
    public static void main(String[] args) {
        Scanner scancer = new Scanner(System.in);
        String s = scancer.nextLine();

        String[] s1 = s.split(" ");
        Double[] x=new Double[5];
        Double[] y=new Double[5];
        int length = s1.length;
        List list =new ArrayList();

        for (int i = 0; i < 5; i++) {
            x[i]=(double)Integer.parseInt(s1[2*i]);
            y[i]=(double)Integer.parseInt(s1[2*i+1]);
        }
        int [][] a=new int[120][5];

        double temp=2000000000d;
        for (int i = 0; i < 5; i++) {
            double[] result=new double[6];
            result[0]=howLong(0,0,x[i],y[i]);
            for (int j = 0; j <5; j++) {
                result[1]=howLong(x[i],y[i],x[j],y[j]);
                for (int k = 0; k < 5; k++) {
                    result[2]=howLong(x[j],y[j],x[k],y[k]);
                    for (int l = 0; l < 5; l++) {
                        result[3]=howLong(x[k],y[k],x[l],y[l]);
                        for (int m = 0; m <5 ; m++) {
                            result[4]=howLong(x[l],y[l],x[m],y[m]);
                            result[5]=howLong(0,0,x[m],y[m]);
                            if((i==j)||(i==k)||(i==l)||(i==m)||(j==k)||(j==m)||(j==l)||(k==m)||(k==l)||(l==m))
                                ;
                            else
                                {
                                double sum=0;
                                for (int n = 0; n < 6; n++) {
                                    sum+=result[n];
                                }
                                temp = Math.min(temp, sum);

                            }

                        }
                    }
                }
            }

        }
        System.out.printf((int)Math.floor(temp)+"");
//        double v = howLong(i, j, x, y);

//        Math.pow()
//        Math.sqrt()
    }
        public static double howLong( double x1,double y1,double x2,double y2){
            double x = Math.abs(x1 - x2);
            double y = Math.abs(y1 - y2);

            return Math.pow((Math.pow(x,2)+Math.pow(y,2)),1.0/2);

        };

}
