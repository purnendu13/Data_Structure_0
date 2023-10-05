public class TreeBuild {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT b=new BT();
        Node root=b.buildTree(nodes);
        System.out.println(root.value);

        //preOrder(root);
      //  System.out.println(CountOfnode(root));
       // System.out.println(Sumofnode(root));
        System.out.println(heightOfBT(root));

    }
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    static class BT{
        static int idx=-1;
        public static Node buildTree(int []nodes){
            idx++;
            if(nodes[idx]==-1)
                return null;
            Node n1=new Node(nodes[idx]);
            n1.left=buildTree(nodes);
            n1.right=buildTree(nodes);
            return n1;
        }
    }
    public static void preOrder(Node root){
        if(root ==null)
        {
            return ;
        }

        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static int CountOfnode(Node root){
        if(root==null)
            return 0;
        int l=CountOfnode(root.left);
        int r=CountOfnode(root.right);
        return l+r+1;
    }
    public static int Sumofnode(Node root){
        if(root==null)
            return 0;
        int ls=Sumofnode(root.right);
        int rs=Sumofnode(root.left);
        return ls+rs+root.value;
    }

    public static int heightOfBT(Node root){
        if(root==null)
            return 0;
        int l=heightOfBT( root.left);
        int r=heightOfBT(root.right);
        int ans=Math.max(l,r);
        return ans+1;


    }



























}
