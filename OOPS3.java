
////INheritencxeeeeeeeeeeee      {  EXTENDS keyword  }
// class Shape {
//    String colour;
// }

// class Triangle extends Shape {
// }

//// SINGle level INHERITENCE
class Shape {
   public void area() {
      System.out.println("displays area");
   }
}

class Triangle extends Shape {
   int length;
   int height;

   public Triangle(int i, int j){
      this.length = i;
      this.height = j;

   }
   public void area(int l, int h) {
      System.out.println(0.5 * l * h);
   }
}

// MULTI level INHERITENCE /// equi-> trinagle-> shape
class equilateraltriangle extends Triangle {
   public equilateraltriangle(int i, int j) {
         super(i, j);
         //TODO Auto-generated constructor stub
      }
   
      public void area(int l, int h) {
      System.out.println(0.5 * l * h);
   }
}

// Hierarchial level INHERITENCE /// trinagle<- shape -> circle

class circle extends Shape {
   public void area(int r) {
      System.out.println((3.14 * r * r));
   }
}

// HYBRID level INHERITENCE ///circle <- shape -> trinagle -> equi
// class equilateraltriangle extends triangle {
// public void area(int l, int h) {
// System.out.println(0.5 * l * h);
// }
// }

public class OOPS3 {
   public static void main(String[] args) {
      Triangle sa = new Triangle(5,3);
      sa.area(5, 2);

   }
}