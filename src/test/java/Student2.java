public class Student2 {


    //Student's profile attributes
    String firstName;
    String lastName;
    int expectedYeartoGrad;
    double gpa;
    String declaredMajor;

    //constructor
   public  Student2(String firstName,String lastName,int expectedYeartoGrad,String declaredMajor){
        this.firstName=firstName;
        this.lastName=lastName;
        this.expectedYeartoGrad=expectedYeartoGrad;
        this.declaredMajor=declaredMajor;

    }
    public int incrementYeartoGrad(){
        return this.expectedYeartoGrad=this.expectedYeartoGrad + 1;

    }
    public static void main(String [] args){
       Student2 student1=new Student2("Andy","Lam", 2010,"Comp Sci");
       Student2 student2=new Student2("Tom","Riddle",2009,"Defense againts the dark arts");

     student2.incrementYeartoGrad();
     System.out.println(student2.expectedYeartoGrad);
    }

    /*
    Access modifiers
    public everywhere in the program
    protected accessible to subclasses and same package
    no modifier accessible to same package
    private only visible in the class
     */



}
