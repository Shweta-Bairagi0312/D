class Duplicates{
    public static void removeDuplicates(String str, int indx, StringBuilder sb, boolean[]map){
        if(indx==str.length()){
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(indx);
        if(map[ch-'a']==true){
            removeDuplicates(str,indx+1,sb,map);
        }
        else{
            map[ch-'a'] = true;
            removeDuplicates(str,indx+1,sb.append(ch),map);

        }
    }
    public static void main(String[]args){
        String str = "shhwetaa";
        boolean[]map = new boolean[26];
        removeDuplicates(str,0,new StringBuilder(),map);


    }
}