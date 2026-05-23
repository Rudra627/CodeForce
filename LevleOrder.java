import java.util.*;
class LevleOrder {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void LevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node curr=queue.remove();
            if(curr == null){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                else{
                    break;
                }
            } 
            else {
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int curr=Math.max(left, right)+1;
        return curr;
    }
    public static boolean isIdentical(Node root,Node subroot) {
        if(root==null && subroot==null){
            return true;
        }
        else if(root==null || subroot==null 
        || root.data!=subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot)){
            return false;
        }
        if(!isIdentical(root.right, subroot)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subNode){
        if(root==null){
            return false;
        }
        if(root.data==subNode.data){
            if(isIdentical(root,subNode)){
                return true;
            }
        }
        return isSubtree(root.left, subNode) || isSubtree(root.right, subNode)
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}