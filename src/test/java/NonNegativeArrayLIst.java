import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NonNegativeArrayLIst extends ArrayList<Integer> {

    public NonNegativeArrayLIst(Integer... numbers){
        Arrays.stream(numbers).filter(n-> n>=0).collect(Collectors.toList());
    }

//    @Override
//    public void add(int index, Integer element){
//        if(element)
//    }
    /*
    Polymorphism is the ability for an object or function to take many forms
    java supports runtime poly and compile-time poly
     */
}
