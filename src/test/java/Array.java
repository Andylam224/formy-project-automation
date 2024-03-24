import java.util.Arrays;

public class Array {

    public static void main(String [] args){

        //a collection of objects of the same data type
        /*
        Array 's size cannot be changed once its allocated
        access by index
        ability to add and remove objects from an array

         */

        //declare an array
//        int [] nums;
//
//        //declare and allocate an array
//        double[] otherNums=new double[5];
//
//        //declare, allocate and init an array
//        String [] availablePets={"cat","dog","fish"};
//        String [] unavailablePets={"bird","rabbit","hamster","gerbil"};
//
//
//        //print ouf the string array without loops
//        System.out.println(java.util.Arrays.toString(availablePets));
//        System.out.println(java.util.Arrays.toString(unavailablePets));
//
//        //now move one availablepet to unavailablepet and vice-versa
//        int indexOfAvailablePet=2; //index of fish
//        int indexOfUnavailablePet=0; //index of birds
//
//        String availablePet=availablePets[indexOfAvailablePet];
//        String unavailablePet=unavailablePets[indexOfUnavailablePet];
//
//        availablePets[indexOfAvailablePet]=unavailablePet;
//        unavailablePets[indexOfUnavailablePet]=availablePet;
//        System.out.println(java.util.Arrays.toString(availablePets));
//        System.out.println(java.util.Arrays.toString(unavailablePets));

        //challenge find the maximum product of two numbers in an unsorted array.

        int[] t1={5,3,2,5,7,0,1};
        int[] t2={-2,-1,-3,4,8,0};
        int[] t3={-20,-10,3,9,-8};

        System.out.println(maximumProduct(t1));
        System.out.println(maximumProduct(t2));
        System.out.println(maximumProduct(t3));



    }

    public static int maximumProduct(int [] intArray){
        int length=intArray.length;
        int max=Integer.MIN_VALUE;

        if(length<2){
            System.out.println("No maximum exists, returning sentinel value");
            return max;
        }
        //Arrays.sort();
        for(int x=0;x<=length;x++){
            for(int j=x+1;j<length;j++){
                if(intArray[x] * intArray[j]>max){
                    max=intArray[x] *intArray[j];
                }
            }
        }
        return max;

    }
}
