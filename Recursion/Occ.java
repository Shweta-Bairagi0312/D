public  class Occ{
    public static void findAllOcc(int[]arr, int key , int indx){
        if(indx==arr.length){
            return ;
        }
        if(arr[indx]==key){
            System.out.println(indx+" ");

        }
        findAllOcc(arr,key,indx+1);
    }
    public static void main(String[]args){
        int[]arr = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        findAllOcc(arr,key,0);

    }
}