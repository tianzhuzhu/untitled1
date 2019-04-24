package OnlineProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a= scanner.nextLine();
        System.out.println(Max01Str(a));
    }
    public static  int Max01Str(String a){
        int j=0;
        int maxlen=0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 1; i < a.length() ; i++) {
            char[] chars = a.toCharArray();
            if(chars[i-1]==chars[i]){
                j=i;
            }
            maxlen=Math.max(maxlen, i-j+1);

        }
        return maxlen;
    }
}
