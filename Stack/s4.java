// reverseString
class stack{
    public static String reverseString(String s){
        Stack<Character>s = new Stack<>();
        int idx =  0;
        while(idx <s.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBUilder res = new StringBuilder();
        while(!st.isEmpty()){
            char ch=  s.pop();
            res.append(ch);

        }
    }
    public static void main(String[]args){

    }
}