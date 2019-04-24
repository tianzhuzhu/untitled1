package BinaryTree;
/*
二叉树遍历程序
使用堆栈完成二叉树先序遍历中序遍历后序遍历
使用堆栈完成二叉树按层遍历 输出层数
使用堆栈完成二叉树序列化
二叉树反序列化
 */
public class BinarTree {


    public int getValue() {
        return value;
    }

    public BinarTree getLeftnode() {
        return leftnode;
    }

    public BinarTree getRightnode() {
        return rightnode;
    }

    int value;
    BinarTree leftnode;
    BinarTree rightnode;
    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftnode(BinarTree leftnode) {
        this.leftnode = leftnode;
    }

    public void setRightnode(BinarTree rightnode) {
        this.rightnode = rightnode;
    }
    public BinarTree(int value) {
        this.value = value;
    }


}
