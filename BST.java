import java.util.ArrayList;

public class BST {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(  int val){
            this.val=val;
        }
    }
    public static Node addValue(Node root,int value ){
            if(root==null)
            {
                root=new Node(value);
                return root;
            }
            if(root.val>value)
                root.left=addValue(root.left,value);
               else
                  root.right= addValue(root.right,value);

               return root;

    }
    public static void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);

    }
    public static boolean search(Node root,int key){
        if(root==null)
            return false;
        if(root.val>key){
           return search(root.left,key);
        }
        else if (root.val==key){
            return true;
        }

        else
        {
            return search(root.right,key);
        }

    }
    public static Node Delete(Node root,int key){
        // for searching key
        if(root.val>key)
            root.left= Delete(root.left,key);
        else if (root.val<key)
            root.right= Delete(root.right,key);
        // for deleting
        else {
            // case 1
            if (root.left == null && root.right == null)
                return null;
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // case 3
            Node IS = InorderSuccessor(root.right);
            root.val = IS.val;
            root.right = Delete(root.right, IS.val);



        }
        return root;
    }
    public static void printrange(Node root,int x,int y){
        if(root==null)
            return;
        if(root.val>=x && root.val<=y){
            printrange( root.left, x, y);
            System.out.println(root.val+" ");
            printrange(root.right,x,y);
        }
        else if (root.val>=y)
            printrange(root.left,x,y);
        else
            printrange(root.right,x,y);

    }
    public static Node InorderSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void printroot2leaf(Node root, ArrayList<Integer> path){

    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14 };
        Node root=null;

        for (int i=0;i<values.length;i++){
            root=addValue(root,values[i]);
        }
//        inOrder(root);
//        System.out.println(" ");
//
//        if(search(root,3))
//            System.out.println("found");
//        else
//            System.out.println("nope ");
//        inOrder(root);
//        System.out.println();
//        Delete(root,5);
//        inOrder(root);
        printrange(root,3,10);

    }

}
