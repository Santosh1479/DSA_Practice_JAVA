
import java.util.*;

class LinkedLis {
   public static final LinkedLis.Node Node = null;
   Node head;
   private int size;

   LinkedLis(){
      this.size = 0;
   }

   class Node {
      String data;
      Node next;

      Node(String data) {
         this.data = data;
         this.next = null;
      }
   }

   // add - first
   public void addFirst(String data) {
      Node newNode = new Node(data);
      if (head == null) {
         head = newNode;
         return;
      }
      newNode.next = head;
      head = newNode;
      size++;
   }

   // Last
   public void addLast(String string) {
      Node newNode = new Node(string);
      if (head == null) {
         head = newNode;
         return;
      }
      Node currNode = head;
      while (currNode.next != null) {
         currNode = currNode.next;
      }
      currNode.next = newNode;
      size++;
   }

   public void PrintList() {
      if (head == null) {
         System.out.println("LIsT is EMPTY");
         return;
      }
      Node currNode = head;
      while (currNode != null) {
         System.out.print(currNode.data + "->");
         currNode = currNode.next;
      }
      System.out.println("null");
   }

   public void DeleteFirst() {
      if (head == null) {
         System.out.println("list is empty");
         return;
      }
      head = head.next;
      size--;
   }

   public void DeleteLast() {
      if (head == null) {
         System.out.println("list is empty");
         return;
      }
      size--;
      if (head.next == null) {
         head = null;
         return;
      }
      Node secondlast = head;
      Node lastnode = head.next;
      while (lastnode.next != null) {
         lastnode = lastnode.next;
         secondlast = secondlast.next;
      }
      secondlast.next = null;
   }

   public Node ReverseRecursive(Node head) {
      if (head == null || head.next == null) {
         return head;
      }
      Node newHead = ReverseRecursive(head.next);
      head.next.next = head;
      head.next = null;
      return newHead;
   }

   public static void main(String[] args) {
      LinkedLis list = new LinkedLis();
      // list.addFirst("a");
      // list.addFirst("is");
      // list.PrintList();

      // list.addLast("List");
      // list.addFirst("this");
      // list.PrintList();

      LinkedList<String> list1 = new LinkedList<String>();
      list1.add("Hi");
      list1.add("Hello");
      

   }

}
