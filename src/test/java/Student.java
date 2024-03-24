import java.util.Scanner;

public class Student {

    int age;
    double gpa;

    char studentFirstInitial;
    char studentLastInitial;


    public static void main(String [] args){
//        int studentAge=14;
//        double studentGPA=3.5;
//
//        boolean hasPerfectAttendance=true;
//
//        System.out.println(studentAge);
//        System.out .println(studentGPA);
//
//
//        String studentName="Andy";
//        String studentLastName="Lam";
//        char studentFirstInitial=studentName.charAt(0);
//        char studentLastInitial=studentLastName.charAt(0);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//        System.out.println(studentName);
//        System.out.println(studentLastName);
//        System.out.println(studentName+" "+studentLastName+ "has a GPA of "+ studentGPA );
//
//        System.out.println("What do you want to update it to?");
//        Scanner scanner=new Scanner(System.in);
//        studentGPA=scanner.nextDouble();
//        System.out.println(studentName+" "+ studentLastName+" has now a GPA of "+studentGPA);

        /*
        Relational operators: <,>,>=,<=,==,!=
        Logical operators
        Arithmetic operators
        Unary operator
        Ternary operator
        Assignment operator


         */


//        System.out.println("Pick a number between 1 and 10");
//        Scanner scanner=new Scanner(System.in);
//        int input=scanner.nextInt();
//        // create condition if statements
//        if(input<5){
//            System.out.println("enjoy the Good luck a friend brings you");
//        }else{
//            System.out.println("Your shoe selection will make you happy today");
//        }
//

        /*
        Scope - the scope of a variable
         */

        //while loops
//        Scanner scanner=new Scanner(System.in);
//        System.out.println();
//        boolean isCurrentSongonRepeat=true;
//        while(isCurrentSongonRepeat){
//            System.out.println("Playing same song again");
//            System.out.println("what to play same song again? if so, answer yes");
//            String input=scanner.next();
//
//            if(input.equalsIgnoreCase("yes")){
//                isCurrentSongonRepeat=false;
//            }
//        }
//        System.out.println("playing next song");

        //challenge
        String question="how many paws do dogs have?";
        String choiceOne="1";
        String choiceTwo="2";
        String choiceThree="4";

        String correctAnswer=choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne+" ,"+choiceTwo+",or "+ choiceThree);
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.next();

        System.out.println(scanner);
        if(answer.equals(correctAnswer)){
            System.out.println("Congrats! you are correct");

        }else{
            System.out.println("Sorry you are incorrect, try again next time");
        }


        /*
        Debugging involves locating and fixing a program's error
        Syntax error, can cause your program to fail before the run
        Logical error


         */


        /*
        Functions a series of finite steps that accomplish some task
        Task: make pb and j
        step1: gather ingredients
        step2;



         */
    }
}
