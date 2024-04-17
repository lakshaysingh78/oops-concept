package abstraction;
interface Animal{
    int eyes =2;//static
     public void walk(); //there is no need in use public because of interface method
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
//abstract methods
//  abstract class Animal{
//     abstract void walk();

  
// }
// class Horse extends Animal{
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
   

public class OOPS{
    public static void main(String[]args){
        Horse horse=new Horse();
        horse.walk();   
        

    }
    
}
