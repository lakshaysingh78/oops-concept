

class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
//classe
class Student{
    String name;//data
    int age;
    public void printInfo(){//member function
        System.out.println(this.name);
        System.out.println(this.age);
    }
   
}
public class oops{
    public static void main(String[]args){
        //pen example//
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";
        // pen1.write();
        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";
        // pen1.printColor();
        // pen2.printColor();
        // //student example
        // Student s1=new Student();//object
        // s1.name="lakshay";
        // s1.age=20;
        // s1.printInfo();
        //bank encapsulation java
    //   bank.Account account1 = new bank.Account();
    //   account1.name="customer1";
    }

}