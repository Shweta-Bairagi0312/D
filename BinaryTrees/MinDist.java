public int MinDist(TreeNode root, int n1, int n2){
    TreeNode lca = Lca(root, n1, n2);

    int dist1 = dist(lca, n1);
    int dist2 = dist(lca, n2);

    return dist1+dist2;
}

public int dist(TreeNode root, int n){
    if(root==null){
        return -1;
    }
    if(root==n){
        return 0;
    }
    int leftdist = dist(root.left,n);
    int rightdist = dist(root.right, n);

    if(leftdist==-1 && rightdist==-1){
        return -1;
    }
    return leftdist==-1? rightdist+1:leftdist+1;


}