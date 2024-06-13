//class in java conataining various attributes and pen as object

class Pen {
    String color;
    String type; //ballpoint; gel

    public void write() {
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color); // using this to provide specific output
    }
}
//class student always remember that class with start with small letter whereas function will always start with captial letter.
class Student {
    String name;
    int age;

    //concept of constructor 
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterizeried constructor
    Student() {
        System.out.println("constrcutor called");
    }

    //parameterized constructor
    /*Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age; 
    }

    Student() {
        
    }
**/

// Polymorphism
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

//abrsaction

abstract class Animal {
    abstract public void walk(); 
    Animal() {
        System.out.println("You are creating a new animal contructor");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chiken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

//interfaces in java
interface Animal1 {
    int eyes = 2;
    void walk();
}

interface Herbivore {

}

class Horse1 implements Animal1, Herbivore {   // multiple inheritances 
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

//static keywords
class Student1 {
    String name;
    static String school;

public static void changeSchool() {
    school = "newschool";
}
}

//main class in java file
public class oops {
    public static void main(String args[]) {
    
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen1.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();
        pen1.write();


        Student s1 = new Student(); // for non parameterized consrtuctor
        //Student s1 = new Student("aman", 24);  // new keyword memeory heap store and student(); is the function called constructor -> to construct java obj
        s1.name = "priya";         
        s1.age = 24;
        s1.printInfo();

        /**Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;**/

        /**Student s2 = new Student(s1);
        s2.printInfo();**/

        //s1.printInfo(s1.name, s1.age);
        Horse horse = new Horse(); //constructor chaining in java
        horse.walk();
        //horse.eat();

        Student1.school = "CVT";
        Student1 student2 = new Student1();
        student2.name = "tony";
        System.out.println(student2.school);
    }
}