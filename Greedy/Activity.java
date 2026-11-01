import java.util.*;

public class Activity{
    public static void main(String[]args){
        int[]start = {1,3,0,5,8,5};
        int[]end = {2,4,6,7,9,9};

        int count = 0;
        List<Integer>list = new ArrayList<>();
        list.add(0);
        count = 1;
        int lastActEnd = end[0];

        for(int i = 1; i<start.length; i++){
            if(start[i]>=lastActEnd){
                count++;
                lastActEnd = end[i];
                list.add(i);
            }
        } 
        for(int i = 0; i<list.size(); i++){
            System.out.print("A"+list.get(i)+" ");
        }
        System.out.println();

    }
}