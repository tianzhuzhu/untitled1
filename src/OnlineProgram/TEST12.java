package OnlineProgram;



import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class TEST12 {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("/");
        char[] chars = s.toCharArray();
        Deque<String> strings = new LinkedList<>();
        StringBuilder stringBuilder =new StringBuilder();
//        stringBuilder.append("/");
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals(".."))
            {
                if(strings.size()==0)
                    stringBuilder.append("../");
                else
                    strings.pop();
            }
            else if(split[i].equals("."))
                ;
            else
                if(!split[i].equals(""))
               strings.push("/"+split[i]);
        }
        while (strings.size()!=0){
            stringBuilder.append(strings.pollLast());

        }
        String s1 = stringBuilder.toString().toString();
        String[] split1 = s1.split("/");
        if(split[split1.length-2].equals(".."))
            System.out.println("/");
        else


        System.out.println(stringBuilder);
    }
}
