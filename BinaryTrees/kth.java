public int kth(TreeNode root,int n, int k){
    if(root==null){
        return -1;
    }
    if(root==n){
        return 0;
    }
    int leftDist =  kth(root.left, n, k);
    int rightDist = kth(root.right,n,k);

    int max = Math.max(leftDist,rightDist);

    if(max+1==k){
        return root.data;
    }
    return max+1;
}
