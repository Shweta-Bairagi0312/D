// now we can use collections framework in java its help us to  implement the Stack data struture without implement by using the another data sturutre
import java.util.*;

 class ST3{
    public static void main (String[]args){
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2); 
        st.push(3);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }

 }