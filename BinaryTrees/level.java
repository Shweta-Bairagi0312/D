public static int Kth(int root, int level, int k){
    if(root==null){
        return;
    }
    if(level==k){
        System.out.println(root.data+" ");
        return ;
    }
    Kth(root.left,level+1,k);
    Kth(root.right,level+1,k);

}