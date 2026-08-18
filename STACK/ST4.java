import java.util.*;

 class ST3{

     public static void pushAtBottom(Stack<Integer>st, int data){
        if(st.isEmpty()){
            st.push(data);
            return ;
        }
        int top = st.pop();
        pushAtBottom(st,data);
        st.push(top);


     }
    public static void main (String[]args){
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2); 
        st.push(3);

        int data = 4;

        pushAtBottom(st,data);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

       
    }

 }