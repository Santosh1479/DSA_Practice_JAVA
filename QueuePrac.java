import java.util.Stack;

public class QueuePrac {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
    }
    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void add(int data){
        if(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        if(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public static void main(String[] args) {
        
    }
    
}
