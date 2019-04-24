package Stack;

import java.util.Stack;

public class StackToQue {
    static Stack<Integer> stackoofer=new Stack<Integer>();
    static Stack<Integer> stackpoil=new Stack<Integer>();
    public static void offer(Integer i){
        stackoofer.push(i);

    }
    public static Integer poil(){
        try {
            if(stackpoil.size()==0){
                while(stackoofer.size()!=0){
                    stackpoil.push(stackoofer.pop());
                }
            }
            return stackpoil.pop();
        }catch (Exception e){
            return null;
        }

    }
    public static void main(String[] args) {

        offer(1) ;offer(2);offer(3);offer(4);
        Integer integer =null;
        while ((integer=poil())!=null)
        System.out.println(integer);

    }
}
