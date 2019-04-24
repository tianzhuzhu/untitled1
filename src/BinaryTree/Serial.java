package BinaryTree;

import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.awt.SunHints;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Serial {
    public static void main(String[] args) {
        BinarTree binarTree1 = new BinarTree(1);
        BinarTree binarTree2 = new BinarTree(2);
        binarTree1.setLeftnode(binarTree2);
        BinarTree binarTree3 = new BinarTree(3);
        binarTree2.setLeftnode(binarTree3);
        BinarTree binarTree4 = new BinarTree(4);
        binarTree1.setRightnode(binarTree4);
        BinarTree binarTree5 = new BinarTree(5);
        binarTree2.setRightnode(binarTree5);

        BinarTree binarTree6 = new BinarTree(6);
        binarTree5.setLeftnode(binarTree6);
        BinarTree binarTree7 = new BinarTree(7);
        binarTree5.setRightnode(binarTree7);

        BinarTree p=binarTree1;
        InOrder(p);
        PrOrder(p);
        PostOrder(p);
        ceil(p);
        StringBuffer sb = Serial(p);
        System.out.println(sb);
        BinarTree dt=DeserialTree(sb);
        ceil(dt);
    }

    private static BinarTree DeserialTree(StringBuffer sb) {
        String s = sb.toString();
        String[] split = s.split("!");
        Queue<BinarTree> queue=new LinkedList<>();
        BinarTree p=null;
        BinarTree root=null;
        root=new BinarTree(Integer.parseInt(split[0]));
        queue.offer(root);
        int index=0;
        while (!queue.isEmpty()){
           p=queue.poll();
            if (!split[++index].equals("#")){
                BinarTree newnode = new BinarTree(Integer.parseInt(split[index]));
                p.setLeftnode(newnode);
                queue.offer(newnode);
           }
           if (!split[++index].equals("#")){
               BinarTree newnode = new BinarTree(Integer.parseInt(split[index]));
               p.setRightnode(newnode);
               queue.offer(newnode);
           }
        }
            return root;

    }

    private static void ceil(BinarTree p) {
        System.out.println("ceil");
        Queue<BinarTree> queue=new LinkedList<BinarTree>();
        queue.offer(p);
        int i=0;
        BinarTree last=p;
        BinarTree nlast= p;
        while(!queue.isEmpty()){
             p = queue.poll();
             System.out.print(p.getValue()+" ");
                if(p.getLeftnode()!=null)
                    queue.offer(p.getLeftnode());
                if(p.getRightnode()!=null) {
                    queue.offer(p.getRightnode());
                    nlast=p.getRightnode();
                }
            if(last==p){
                System.out.println();
                last=nlast;
            }
        }
    }
    public static StringBuffer Serial(BinarTree p){
        StringBuffer sb =new StringBuffer();
        System.out.println("ceil serial");
        Queue<BinarTree> queue=new LinkedList<BinarTree>();
        queue.offer(p);
        int i=0;
        BinarTree last=p;
        BinarTree nlast= p;
        sb.append(p.value+"!");
        while(!queue.isEmpty()){
            p = queue.poll();

            if(p.getLeftnode()!=null) {
                queue.offer(p.getLeftnode());
                sb.append(p.getLeftnode().value+"!");
            }
            else
                sb.append("#!");
            if(p.getRightnode()!=null) {

                    queue.offer(p.getRightnode());
                    nlast = p.getRightnode();
                    sb.append(p.getRightnode().value+"!");

            }
            else {
                sb.append("#!");
            }

            if(last==p){
//             sb.append("\n");
                last=nlast;
            }
        }
        return sb;
    }



    public static void InOrder(BinarTree p){
        System.out.println("in");
        Stack<BinarTree> stack =new Stack<BinarTree>();
        while((!stack.isEmpty())||p!=null){
            while(p!=null) {
                stack.push(p);
                p = p.getLeftnode();
            }
                p = stack.pop();
                System.out.println(p.getValue());
                p=p.getRightnode();

            }

        }
    public static void PrOrder(BinarTree p){
        System.out.println("pre");
        Stack<BinarTree> stack =new Stack<BinarTree>();
        while((!stack.isEmpty())||p!=null){

            while(p!=null) {
                System.out.println(p.getValue());
                stack.push(p);
                p = p.getLeftnode();
            }
            p = stack.pop();

            p=p.getRightnode();

        }

        }
    public static void PostOrder(BinarTree p){
        BinarTree lastvist=null;
        System.out.println("post");
        Stack<BinarTree> stack =new Stack<BinarTree>();

            while(p!=null) {
                stack.push(p);
                p = p.getLeftnode();
            }
            while(!stack.isEmpty()) {
                p = stack.pop();

                if((p.getRightnode()==null)||p.getRightnode()==lastvist){
                System.out.println(p.getValue());
                lastvist=p;
                }
                else {
                    stack.push(p);
                    p=p.getRightnode();
                    while(p!=null){
                        stack.push(p);
                        p=p.getLeftnode();
                    }
                }
            }


    }
}


