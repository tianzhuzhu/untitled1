package string;

import java.util.HashMap;
import java.util.Map;

public class MaxNoDIfferentSonStr {
    public static void main(String[] args) {
     String a=new String("abc");
     System.out.println(MaxNoDIfferentSonStr(a));
    }
    public static  int MaxNoDIfferentSonStr(String a){
        int j=0;
        int maxlen=0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length() ; i++) {
            char c=a.charAt(i);
            if(map.containsKey(c)){
                j=Math.max(j,map.get(c));
            }
            maxlen=Math.max(maxlen, i-j+1);
            map.put(c, i+1);
        }
        return maxlen;
    }

}
