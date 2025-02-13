abstract class Animal {
   // public void walk(){
   abstract void walk();

   Animal() {
      System.out.println("u creating new animal");
   }

   public void eats() {
      System.out.println("Animal eats");
   }
}

class Horse extends Animal {
   Horse() {
      System.out.println("ceated a horse");
   }

   public void walk() {
      System.out.println("walk on 4 legs");
   }
}

class chicken extends Animal {
   public void walk() {
      System.out.println("walk on 2 legs");
   }
}

public class OOPS4 {
   public static void main(String[] args) {
      Horse horse = new Horse();

      // aabstract m h so cant build object in it
      // Animal animal=new Animal();
      // animal.walk();
      horse.walk();
      horse.eats();
   }

}
