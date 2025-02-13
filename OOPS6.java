//INTERFACES

interface Animal{
   //Static final declaration
   // int eyes =2;
   void walk();

   //INTERFACES cant have constructors
   //Animal(){  
   //}
}
interface Herbivore{

}
class Student{
   String name;
   //STATIC= same detail for multiple people
   static String School;
   public static void changeSchool(String newSchool){
      School=newSchool;
   }
}
// multiple INHERITENCE{cant be dont in classes only in INTERFACES}
class Horse implements Animal,Herbivore{
   public void walk(){
      System.out.println("walks on 4 legs");
   }
}
public class OOPS5 {
   public static void main(String[] args) {
      // Horse horse=new Horse();
      // horse.walk();
      Student.School="Edu ASIA";
      System.out.println(Student.School);
      Student student1=new Student();
      student1.name="SAn";
      Student.changeSchool("VEMANA");
      System.out.println(student1.name+" "+student1.School);
   }
}
