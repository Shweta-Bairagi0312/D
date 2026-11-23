public static Node Lca(Node root, int n1, int n2){
    ArrayList<Integer>path1 = new ArrayList<>();
    ArrayList<Integer>path2 = new ArrayList<>();

    getpath(root,n1,path1);
    getpath(root,n2,path2);

    int i = 0;
    for(; i<path1.size() && path2.size(); i++){
        if(path1.get(i) != path2.get(i)){
            break;
        }
    }

    Node lca = path1.get(i-1);
    return lca;
}

public static boolean getPath(Node root, int n, ArrayList<Node>path){
    if(root==null){
        return false;
    }
    path.add(root);
    if(root==n){
        return true;
    }


    boolean foundLeft = getPath(root.left,n,path);
    boolean foundRight = getPath(root.right,n,path);

    if(foundLeft || foundRight){
        return true;
    }
    path.remove(path.size()-1);
    return false;

}

