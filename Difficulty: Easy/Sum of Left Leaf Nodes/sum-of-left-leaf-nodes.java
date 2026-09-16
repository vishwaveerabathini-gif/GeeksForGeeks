/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    static int sum;
    public void traverse(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.data;
        }
        traverse(root.left);
        traverse(root.right);
    }
    public int leftLeavesSum(Node root) {
        // code here
        sum=0;
        traverse(root);
        return sum;
    }
}
