package string;

public class BbracketsIsAvailable {
    public static void main(String[] args) {
        String a="{{}{}{}}";
        System.out.println(IsAvailable(a));
    }
    public static boolean IsAvailable(String a){
        int num=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='{')
                num++;
           else  if (a.charAt(i)=='}')
            num--;
           if(num<0)
               return  false;
        }
        if(num==0)
            return true;
        else
            return false;
    }
}
