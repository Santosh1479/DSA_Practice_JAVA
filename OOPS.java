import java.sql.Struct;

class Pen {
   String colour;
   String type;

   public void write() {
      System.out.println("writing");
   }

   public void printcolour() {
      System.out.println(this.colour);
   }

   public void printtype() {
      System.out.println(this.type);
   }
}
// STUDENT

class Student {
   String name;
   int age;
   
   public void printinfo() {
      System.out.println(this.name +  this.age);
   }

   // NON PARAMETERIZED
   // Student(){
   // System.out.println("constructor called");
   // }

   // PARAMETERIZED
      public Student(String string, int i) {
         this.name = string;
         this.age = i;      }
   }
   
   public class OOPS {
      public static void main(String[] args) {
         // Pen pen1=new Pen();
         // pen1.colour="green";
         // pen1.type="gel";
   
         // pen1.write();
         // pen1.printcolour();
         // pen1.printtype();
   
         // NON PARAMETERIZED
         // Student s1=new Student();
         // s1.name="Santosh";
         // s1.age=69;
         // s1.printinfo();
   
         // PARAMETERIZED
         Student s1 = new Student("agsgd", 25);
      // s1.name = "agsgd";
      // s1.age = 25;
      s1.printinfo();

      // Student s2 = new Student(s1);
      // s2.printinfo();

   }
}
