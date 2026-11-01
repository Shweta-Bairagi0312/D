class R7{
    public static int lastOcc(int[]arr, int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOcc(arr, key, i-1);
    }
    public static void main(String[]args){
       int []arr = {1,2,3,4,5,3};
       int key = 3;
       int n = arr.length;
       int res = lastOcc(arr, key, n-1);
       System.out.println(res);
      
    }
}