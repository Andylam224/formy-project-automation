import org.apache.commons.exec.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class StringManipulation {

    /* Strings are immutable
    Characters cannot be changed
    Length cannot be changed
    In concatenation, we create a new String, leaving the old Strings unaltered
     */

    public static void main(String[] args) {
//        String firstName = "Shelly";
//        String lastName = "Parker";
//        String name = firstName + lastName;
//        System.out.println(name);
//
//        String concatName = (firstName.concat(" ").concat(lastName));
//
//
//        /*
//        Since String are immutable, String builder class allow to create string like objects that are mutable
//         */
//
//        StringBuilder stringBuilder=new StringBuilder("abc");
//        stringBuilder.append("def");
//        stringBuilder.append("ghi");
//        stringBuilder.insert(0,"xyz");
//        stringBuilder.delete(3,6);
//        String alpha=stringBuilder.toString();
//        System.out.println(alpha);

        //Normalize string input

//        String panda=" Panda";
//        String fish="  fish  ";
//        String horse="Horse  ";
//        String cat=" CAT";
//        String nothing="   ";
//
//        List<String> animals=List.of(panda,fish,horse,cat,nothing);
//        animals.stream().forEach(s -> System.out.println(s.trim()));
        //trim off the spaces of the strings

        //0 1 2 3 4 5
        //A P P L E S

        String apples = "Apples";
        char firstCharacter = apples.charAt(0);
        System.out.println(firstCharacter);
        System.out.println(apples.indexOf("e"));
        //substring function, substring is inclusive to the first index while exclusive to the second index
      String sub=  apples.substring(2, 4);
      System.out.println(sub);
      System.out.println(apples.contains("app"));
      char [] applesArray=apples.toCharArray();

      //manipulation and parsing strings
        String text= "The giant panda has an insatiable appetite for bamboo."+
                "A typical animal eats half the day-a full 12 out of every 24"+
                "hours-and relives itself dozens of times a day. It takes 28"+
                "pounds of bamboo to satisfy a giant pand's daily dietary needs. "+
                "Pands will sometimes eat birds or rodents as well";

        //split function
       String[] sentences= text.split("\\. ");
        System.out.println("The text has "+ sentences.length+" sentences.");
        String[] words=text.split(" |-");
        System.out.println("The text has "+ words.length +" words.");
        System.out.println(Arrays.asList(words));
        System.out.println(text.length());


        //string equality
        //both literals are using the same "abc"
        String literalA="abc";
        String literalB="abc";


        //creating a string object, objectA and objectb are not the same
//        String objectA=new String("abc");
//        String objectB=new String("abc");
//        System.out.println(literalA==objectA);
//        System.out.println(literalA==objectB);
//        System.out.println(literalA==literalB);
//
//
//        //equals checks for the value not reference poits
//        System.out.println(literalA.equals(objectA));
//        System.out.println(literalA.equals(objectB));
//        System.out.println(literalA.equals(literalB));


        /*palindrome challenge
        Input: String
        Output: true or false, depending on whether the String is a palindrome or not
        Punctuation and symbols must follow the palindrome rules
        lowercase and uppercase letters are considered the same



         */

//        String s1="maDam";
//        String s2="raceCar";
//        String s3="aBba";
//        String s4="swims";
//        String s5="wifI";
//
//        System.out.println(isPalindrome(s1));
//        System.out.println(isPalindrome(s2));
//        System.out.println(isPalindrome(s3));
//        System.out.println(isPalindrome(s4));
//        System.out.println(isPalindrome(s5));
//
//
//        System.out.println(isPalindrome2(s1));
//        System.out.println(isPalindrome2(s2));
//        System.out.println(isPalindrome2(s3));
//        System.out.println(isPalindrome2(s4));
//        System.out.println(isPalindrome2(s5));

        String st1="HellO";
        String st2=" there is a quiet Mouse";
        String st3="I am happy     ";

       VowelsConsonantsCounter(st1);
        VowelsConsonantsCounter(st2);
        VowelsConsonantsCounter(st3);
     }

     //check for palindrome with a char array
    public static boolean isPalindrome(String text){
        String normalized=text.toLowerCase();
        boolean isPalindrome=true;
        char[] chararray=normalized.toCharArray();
        for(int x=0;x<chararray.length;x++){
            if(chararray[x]!=chararray[chararray.length-1-x]){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
           System.out.println("is a palindrome");
        }
        return isPalindrome;
    }

    //check for palindrome with String builder reverse
    public static boolean isPalindrome2(String text){
       StringBuilder stringBuilder=new StringBuilder();
       String normalized=text.toLowerCase();

       //THis is the easy way to reverse, but dont use this, not authentic
        //String reverse= new StringBuilder(normalized).reverse().toString();

       //create a reverse forloop
        for(int x=normalized.length()-1;x>=0;x--){
            stringBuilder.append(normalized.charAt(x));
        }
        return (normalized.equals(stringBuilder.toString()));
    }

    //challenge find the number of vowels and consonants counter
    //vowels: a, e,i,o,u
    public static void VowelsConsonantsCounter(String text){
        int vowelsCount=0;
        int consonantCount=0;
        String vowels="aeiou";
        String normalized=text.toLowerCase().trim();
        char[] normalizedArray=normalized.toCharArray();

        for(char c : normalizedArray){
            if(vowels.indexOf(c)!=-1){
                vowelsCount++;

            }else if (c!=' '){
                consonantCount++;
            }
        }
        System.out.println("There are "+vowelsCount+" vowels in "+ text);
        System.out.println("There are "+consonantCount+" consonants in "+ text);


    }
}
