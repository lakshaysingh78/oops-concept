package polymorphism;
class Student{
    String name;//data
    int age;
    public void printInfo(String name){//member function
       System.out.println(name);
    }
    public void printInfo(int age){//member function
        System.out.println(age);
     }
     public void printInfo(String name,int age){//member function
        System.out.println(name+" "+age);;
     }
}
public class poly {
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="aman";
        s1.age=24;
        s1.printInfo(s1.name,s1.age);


    }
    
}
