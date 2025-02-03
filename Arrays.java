import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("array size?");
        int  size=sc.nextInt();
        int  A[]=new int [size];
        
        for(int  i=0;i<size;i++){
            System.out.println(A[i]);
        }
        if(size!=0){
            System.out.println("enter the array");
        
            for(int  i=0;i<size;i++){
                A[i]=sc.nextInt ();
            }
            System.out.println("enter the number to be searched");
            int  x=sc.nextInt ();
            int s=x;
            for(int  i=0;i<size;i++){
                if(A[i]==x){
                    s=i;
                }
            }
            if(s!=x){
                System.out.println("found at index "+ s);
            }else{
                System.out.println("Not found");
            }
        }else{
            System.out.println("Null Array");
        }

        //2D Array
        int  b[][]=new int [3][5];
        for(int  i=0;i<3;i++){
            for(int j=0;j<5;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int  i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        
     }   
}    
