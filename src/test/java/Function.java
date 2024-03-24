import java.util.Scanner;

public class Function {

    //define function
    public static void announceTeaTime(){
        System.out.println("Waiting for developer teatime");
        Scanner scanner=new Scanner(System.in);
        scanner.next();
        System.out.println("It's developer tea time");
    }

    public static double calculateTotalMealPrice(double tipRate,double taxRate, double mealprice){
        double tip=tipRate*mealprice;
        double tax=taxRate*mealprice;
        double result=tip+tax+mealprice;
        System.out.println("your total meal price is "+ result);
        return result;
    }

    public static double calculateEmployeeSalary(int hoursPerWeek, double amtOfmoneyPerHour, int vacationDays){
        if(hoursPerWeek<0){
            return -1;
        }
        if(amtOfmoneyPerHour<0){
            return -1;
        }
        double vacationDaysOffCalculated=vacationDays*(amtOfmoneyPerHour*8);
        double grossYearlySalary=(hoursPerWeek*amtOfmoneyPerHour*52)-vacationDaysOffCalculated;
        System.out.println("the gross yearly salary is "+ grossYearlySalary);
            return grossYearlySalary;
    }

    public static void main(String[] args){
        //call function
        //announceTeaTime();
//       double grpTotalMealprice= calculateTotalMealPrice(.18,.08,25);
//       double individualTotalMealPrice=grpTotalMealprice/5;
//       System.out.println(grpTotalMealprice);
//        System.out.println(individualTotalMealPrice);
        //calculateEmployeeSalary(40,50,1);
        Triangle triangleA=new Triangle(15,8,15,8,17);
        Triangle triangleB=new Triangle(3,2.598,3,3,3);

        double triangleAArea=triangleA.findArea();
        System.out.println(triangleAArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numberofSide);


    }

    /*behaviors of a class
    Attributes/properties

    Behaviors: functions  that are related to (and located inside) the class

    Constructor- a special method or behavior inside every class that creates and initializes instance. It always returns a instance of the class
    this keyword helps distinguish attribute variable and parameter variable
     */



}
