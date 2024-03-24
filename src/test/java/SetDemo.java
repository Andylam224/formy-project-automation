import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    /*
    Set contains no duplicates
    Set.add() gives back boolean result if you can add but if its dup, its gives false
     */

    public static void main(String[] args){
        String s="Hello world";
        char[] chararray=s.toCharArray();
       // Set<Character> set=new HashSet<Character>();
        Set set=new HashSet<>();

        int chr=0;
        for(int i=0;i<chararray.length;i++){
            if(!set.add(chararray[i])){
                System.out.println("Index/position of duplicate characters: "+ i);
                chr++;
            }
        }
        System.out.println("total number of duplicate characters: "+ chr);
    }
}
