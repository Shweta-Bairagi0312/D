import java.util.*;

class ST4{
    public static String reverseString(String str){
        Stack<Character>st = new Stack<>();
        int idx = 0;
        while(idx<str.length()-1){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());

        }
        return sb.toString();
    }
    public static void main(String[]args){
        String res = reverseString("abc");
        System.out.println(res);

    }
}