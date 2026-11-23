public int sumTree(TreeNode root){
    if(root==null){
        return 0;
    }
    int leftsum = sumTree(root.left);
    int rightsum = sumTree(root.right);

    TreeNode data = root.data;
    root.data = leftsum+rightsum;

    return leftsum+rightsum+data;
}