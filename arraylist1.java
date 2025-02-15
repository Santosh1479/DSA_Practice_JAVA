import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      // ArrayList<String> list1=new ArrayList<String>();

      // add ELEM
      list.add(0);
      // list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println(list);

      // get
      int elem = list.get(3);
      System.out.println(elem);

      // add elem inbetween
      list.add(1, 1);

      System.out.println(list);

      // set element
      list.set(0, 5);
      System.out.println(list);

      // delete
      list.remove(5);
      System.out.println(list);

      // size of arraylist
      int size = list.size();
      System.out.println(size);

      // iterate
      for (int i = 0; i < size; i++) {
         System.out.println(list.get(i));
      }

      // sorting
      Collections.sort(list);
      System.out.println(list);

      list.clear();
      System.out.println(list);

   }
}
