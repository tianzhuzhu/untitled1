package zijietiaodong;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class huawei1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        String[] s1 = l.split(" ");
        int N=Integer.parseInt(s1[0]);
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        int i=0,sum=0;
        while(!("".equals(l=scanner.nextLine()))){
            String[] split = l.split(",");
            List<Integer> list1 = new ArrayList<Integer>();
            for (int j = 0; j < split.length; j++) {
                list1.add(Integer.parseInt(split[j]));
            }
            list.add(list1); }
        List<Integer> integers =new ArrayList<Integer>();
       while(list.size()>0){
           for (int j = 0; j < list.size(); j++) {
               List<Integer> list1 = list.get(j);
               for (int k = 0; (k < N)&&list1.size()>0; k++) {
                   integers.add(list1.remove(0));
               }
               if(list1.size()==0) {
                   list.remove(j);
                   i--;
               }
           }
       }
        for (int j = 0; j < integers.size(); j++) {
            System.out.print(integers.get(j));
        }
    }
}
