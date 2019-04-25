package exam;

import java.util.Stack;

public class StackBinaryTree {



    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);
        Node node7=new Node(7);
        Node node8=new Node(8);
        node1.leftnode=node2;
        node1.rightnode=node3;
        node2.leftnode=node4;
        node2.rightnode=node5;
        node3.leftnode=node6;
        node4.rightnode=node7;
        node7.rightnode=node8;
        Pre(node1);
        System.out.println("");
        in(node1);
        System.out.println("");
        post(node1);
    }
    static void Pre(Node node){
        Stack<Node> stack=new Stack<>();
        while(!stack.isEmpty()||node!=null){
           if(node!=null){
               System.out.printf(node.value+"");
               stack.push(node);
               node=node.leftnode;
           }
           else{
               node=stack.pop();
               node=node.rightnode;
           }
        }
    }
    static void in(Node node){
        Stack<Node> stack= new Stack<>();
            while(node!=null||!stack.isEmpty()){
                if(node!=null){
                    stack.push(node);
                    node=node.leftnode;
                }
                else{

                    node = stack.pop();
                    System.out.print(node.value+"");
                    node=node.rightnode;
                }
             }

        }
    static void post(Node node){
        Stack<Node> stack= new Stack<>();
        Stack<Node> stack2= new Stack<>();
        while(node!=null||!stack.isEmpty()){
            if(node!=null){
                stack.push(node);
                stack2.push(node);
                node=node.rightnode;
            }
            else{

                node = stack.pop();
                node=node.leftnode;
            }
        }
        while(!stack2.isEmpty()){
            System.out.printf(stack2.pop().value+"");
        }

    }
    static void PreNoStack(Node node){



    }


}
