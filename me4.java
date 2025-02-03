//++++++++++++++++++PATTERNS++++++++++
//NESTED LOOPS======++++++++++++++++

import java.util.*;
public class me4{
    // Run|Debug
    public static void main(String args[]){
        
        // Scanner sc=new Scanner(System.in);
        //for
        //***** 
        //*****
        //*****
        //*****
        int m=5;
        int n=4;

        //smart banr h bkl
        // for(i=0;i<5;i++){
        //     System.out.println("*****");
        // }

        // for 2 for loops

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print("*");
        //     }System.out.println(" ");
        // }

        //for 
        //*****
        //*   *
        //*   *
        //*****

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1||j==1||i==n||j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for half pyramid
        //*
        //**
        //***
        //****

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for ulta half pyramid
        //  ****
        //  *** 
        //  **  
        //  *


        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

        // for ulta half pyramid
        //     *
        //    ** 
        //   *** 
        //  **** 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){    
        //       System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //       System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //for          aaaaaaaaaaa
        //1
        //12
        //123
        //.........
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //for 
        // 1234
        // 123
        // 12
        // 1
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");    
        //     }
        //      System.out.println();
        // }



        //for 
        //1
        //23
        //456
        //.........
        // int s=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(s+" ");
        //         s++;    
        //     }
        //      System.out.println();
        // }

        //for 
        //1
        //01
        //101
        //0101
        //.........
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int s=(i+j);
                if(s%2==0){
                    System.out.print(1+" ");

                }
                else{
                    System.out.print(0+" ");
                }
                // System.out.print(s+" ");
                // s++;    
            }
             System.out.println();
        }
    }
}
