import java.util.LinkedList;
import java.util.ArrayList;

public class linkedLSTadv {
    public static final LinkedLis.Node Node = null;
    Node head;

    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public  Node remNnode(LinkedList<String> s, int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
            size++;
        }
        if(size == n){
            return head.next;
        }
        int idx = size-n;
        Node prev = head;
        int i = 1;
        while(i < idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }

    public static void main(String[] args) {
        LinkedList<String> S = new LinkedList<>();
        S.add("me");
        S.add("me1");
        S.add("me2");
        S.add("me3");
        S.add("me4");
        S.add("me5");
        S.add("me6");
        System.out.println(S);

    }

}
