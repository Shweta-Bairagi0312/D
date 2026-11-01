class Friends{
    public static int friendsParing(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = friendsParing(n-1);
        int pair = friendsParing(n-2);
        int ways = pair*(n-1);

        int total = single+ways;
        return total;

    }
    public static void main(String[]args){
        int n = 3;
        int res = friendsParing(n);
        System.out.println(res);

    }
}