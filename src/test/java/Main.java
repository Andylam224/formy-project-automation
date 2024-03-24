public class Main {

    public static void main(String[] args){

//        UserTableManager userTableManager=new UserTableManager();
//
//        UserData userData=new UserData("Elizabeth Taylor","betty.taylor@hotwire.com");
//        userTableManager.putItem(userData);

        HogwartsStudent student=new HogwartsStudent("Elizabeth Blackburn", 11);

        System.out.println("Name: "+student.getName());
        System.out.println("House: "+ student.getHouse());

        //CANNOT DO:
        //student.name;
        //student.age;
    }
}

/*Encapsulation = binding an object's state and behaviors together,
with Encapsulation we can hide a class's data from other classes. - data hiding
we achieve encapsulation in Java by declaring all the field in a class as private and writing public methods in the class to set and get their values
Why Encapsulation? so that the user has no idea of the inner implementation of a given class and the data it contains, it allows you to hide how values are stored and maintained within a given class



Inheritance - process where one class acquires the fields and methods of another through extension via extension
with inheritance, we can write common properties and functionality in one class and have other classes with unique features extend this single class
 */
