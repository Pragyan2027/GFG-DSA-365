/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
        return height(root)!=-1;
    }
      private int height(Node root){
        if(root==null)return 0;
        int l=height(root.left);
        int r=height(root.right);
        if(l==-1 || r==-1)return -1;
        if(Math.abs(l-r)>1)return -1;
        return Math.max(l,r)+1;
    }
}