class R4{
    public static int sumN(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n+sumN(n-1);
       


    }
    public static void main(String[]args){
        int n = 5;
        int res = sumN(n);
        System.out.println(res);

    }
}