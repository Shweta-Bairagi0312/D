
//////pushAtBottom
class stack{
    public static void pushAtBottom(Stack<Integer>st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,data);
        st.push(top);
       
    }

    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
      System.out.println(s);

    }
}