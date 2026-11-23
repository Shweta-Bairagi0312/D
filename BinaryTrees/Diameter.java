public static int diameter(Node root){
    if(root==null){
        return 0;
    }
    int lD = diameter(root.left);
    int lh = height(root.left);
    int rD = diameter(root.right);
    int rh = height(root.right);
     
    int self = lh+rh+1;
    return Math.max(self,math.max(lD,rD));
}