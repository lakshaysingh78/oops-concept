package inheritance;
class Shape{    //Base class or parent class
    public void area(){
        System.out.println("display area");
    }
    String color;
}
class Triangle extends Shape{   //child class
 public void area(int l ,int h){
    System.out.println(1/2*l*h);
 }
}
 class   Cricle extends Shape{   //child class
    public void area(int r){
       System.out.println((3.14)*r*r);
    }
}
public class inherit {
    public static void main(String[]args){
        Triangle t1=new Triangle();
    t1.color="red";

    }
   

    
}
