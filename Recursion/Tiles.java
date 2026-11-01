class Tiles{
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical = tilingProblem(n-1);
        int horizontal = tilingProblem(n-2);
        int totalWays = vertical+horizontal;
        return totalWays;
    }
    public static void main(String[]args){
        int n = 4;
        int res = tilingProblem(n);
        System.out.println(res);

    }
}