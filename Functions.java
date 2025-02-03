import java.util.*;
public class Functions{
    public static void main(String args[]){
        System.out.println("enter the name");
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        int y=sc.nextInt();
        int x=sc.nextInt();

        NamePrint(c);
        int s=Mul(x,y);
        System.out.println(s);
        int v=Factorial(y);
        System.out.println(v);
        int q=GCD(x,y);
        System.out.println(q);
        

    }
    public static void NamePrint(String name){
        System.out.println(name);
        return;
    }
    public static int Mul(int a,int b){
        System.out.println("priduct of two numbers is"+a*b);
        return a*b;
    }
    public static int Factorial(int a){
        if(a==1){
            return 1;
        }
        if(a==0){
            return 0;

        }
        return a*Factorial(a-1);
    }
     public static int GCD(int a,int b){
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
     return 0;
     }        
}    
