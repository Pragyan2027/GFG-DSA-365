/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {

        // Your code here
        int res = 0; // To store the final diameter

    int height(Node root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        res = Math.max(res,  lh + rh); // Update diameter

        return 1 + Math.max(lh, rh); // Return height
    }
    
    int diameter(Node root) {
        height(root);
        return res;
    }
}