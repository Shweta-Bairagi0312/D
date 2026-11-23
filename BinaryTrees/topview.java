public class topview{
    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }

    }
    public static void topView(Node root){
        Queue<Info>Q = new LinkedList<>();
        Map<Integer,Node>map = new HashMap<>();

        int min = 0;
        int max = 0;
        Q.add(new Info(root,0));
        Q.add(null);

        while(!Q.isEmpty){
            info curr = Q.poll();
            if(curr==null){
                if(Q.isEmpty()){
                    break;
                }
                else{
                    Q.add(null);
                }
            }

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left != null){
                Q.add(new Info(curr.node.left,curr.hd-1));
                min = Math.min(min,curr.hd-1);
            }
            if(curr.node.right != null){
                Q.add(new Info(curr.node.right,curr.hd+1));
                max = Math.max(min,curr.hd+1);
            }
        }

         for(int i = min i<=max; i++){
            Syatem.out.println(map.get(i).data);
        }
    }
}
