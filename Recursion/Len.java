// public class Len{
//     public static int strLength(String str , int indx,int count){
//         if(indx==str.length()){
//             return count;
//         }
//         return strLength(str, indx+1, count+1);
//     }
//     public static void main(String[]args){
//         String str = "shweta";
//         int res = strLength(str,0,0);
//         System.out.println(res);

//     }
// }

// import java.util.*;
// public class Len{
//     public static int strLength(String str){
//         if(str.length()==0){
//             return 0;
//         }
//        return strLength(str.substring(1)) +1;
//     }
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);

//         String str = input.nextLine();
//         int res = strLength(str);
//         System.out.println(res);

//     }
// }

import java.util.*;

public class Len {

    public static int strLength(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return strLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine();

        while (t-- > 0) {
            String str = input.nextLine();

            int res = strLength(str);

            System.out.println(res);
        }
    }
}