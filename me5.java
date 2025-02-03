import java.util.*;
public class me5{
    // Run|Debug
    public static void main(String args[]){
        // int n=4;
        // for
        //*      *
        //**    **
        //***  ***
        //********
        //********
        //***  ***
        //**    **
        //*      *
        
        // for 1st upper half of butterfly
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
            

        // int spaces =2*(n-i);
        // for(int j=1;j<=spaces;j++){
        //      System.out.print(" ");
        // }

        // for(int j=1;j<=i;j++){
        //     System.out.print("*");
        // }
        // System.out.println();

        // }


        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        
        // int spaces =2*(n-i);
        // for(int j=1;j<=spaces;j++){
        //      System.out.print(" ");
        // }

        // for(int j=1;j<=i;j++){
        //     System.out.print("*");
        // }
        // System.out.println();
        // }


        //for
        //    *****
        //   *****
        //  *****
        // *****
        //*****





        // int n=5;
        
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //for

        //    1 
        //   2 2
        //  3 3 3
        // 4 4 4 4
        //5 5 5 5 5

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     // print spacesd
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //for
        //    1
        //   212
        //  32123
        // 4321234
        //543212345




;
        // for(int i=1;i<=n;i++){
        //     // print spacesd
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //for
        //   *
        //  ***
        // *****
        //*******
        //*******
        // *****
        //  ***
        //   *





        int n=4;
        for(int i=1;i<=n;i++){
            // print spacesd
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            //lower half
            for(int i=n;i>=1;i--){
            // print spacesd
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
    
}
