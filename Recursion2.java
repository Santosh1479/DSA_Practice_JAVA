import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
          System.out.println("power of what no?");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("ur n?");
        int n=sc.nextInt();
        int d=power(x, n);
        System.out.println(d);
    }
           // power with stack height logn
           public static int power(int x,int n) {
            if(n==0){
                return 1;
            }
            if(n%2==0){
               return power(x, n/2)*power(x, n/2);
            }
            else{
                return power(x, n/2)*power(x, n/2)*x;
            }
            

        }
}
