public class Digits{
    public static void printDigits(int num, String[]map){
        if(num==0){
            return;
        }

        int lastdigit = num%10;
        printDigits(num/10,map);
        System.out.print(map[lastdigit]+" ");

    }
    public static void main(String[]args){
        String[]map = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int num = 2019;
        printDigits(num,map);
    }
}