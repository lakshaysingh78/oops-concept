import java.util.*;
class Person{
    String name;//data
    int age;
    public void printInfo(){//member function
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //non parametrized constructor
 Person(){
     System.out.println("constructor called");
   }
    //parametrized constructor//
 Person(String name,int age){
       this.name=name;
     this.age=age;
    }
    //copy constructor
    Person(Person P2){
        this.name=P2.name;
      this.age=P2.age;
     }
    }
public class constructor {
    public static void main(String[]args){
        //   //person example
        //   //non parametrized constructor
        //   Person P1=new Person();
        //    //parametrized constructor//
        //   Person P1=new Person("aman",24);//object
         //copy
         Person P1= new Person();
         P1.name="lakshay";
         P1.age=25;
         
          P1.printInfo();
    }
    
}
