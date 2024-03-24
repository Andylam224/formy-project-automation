import java.util.HashMap;
import java.util.Map;

public class MapDemo {
//map cannot have duplicate keys
    public static void main(String[] args){
        String s="Hello world";

        //convert to char array
        char [] chararray=s.toCharArray();

        Map<Character,Integer> map=new HashMap<Character,Integer>();
       for(char c:chararray){
           if(!map.containsKey(c)){
               map.put(c,1);
           }else{
               map.put(c,map.get(c)+1);
           }
       }

       for(Map.Entry entry:map.entrySet()){
           System.out.println(entry.getKey() +" "+ entry.getValue());
       }
    }
}

/*
Primitive data types
boolean
int
char
byte
short
long
double
float

Reference types
String
object
 */