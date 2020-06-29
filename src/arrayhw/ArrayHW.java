/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhw;

/**
 *
 * @author User
 */
public class ArrayHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //  1. Дано одновимірний масив. Знайти найбільший та найменший елементи масиву та поміняти їх у масиві місцями. (random)
     
   int [] arr= new int[10];
   int max=0,min=0,maxI=0,minI=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=( (int)(Math.random( )*100) +1);
            System.out.print(arr[i]+" ");
        }
        min=arr[0];
        for (int i = 0; i < arr.length; i++) {
           
            if(min>arr[i])
            {
                min=arr[i];
                minI=i;
            }
               if(max<arr[i])
            {
                max=arr[i];
                maxI=i;
            }
        }
        System.out.println();
        System.out.println("Max:"+max+ " MaxI:"+maxI);
        System.out.println("Min:"+min+ " MinI:"+minI);
        int t;
        t=arr[minI];
       arr[minI]= arr[maxI];
       arr[maxI]=t;
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       ////////////////////////////////////////////////
      //2. Дано одновимірний масив. Знайти суму елементів з непарними індексами. (random)
      
       int [] arr1= new int[10];
  int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=( (int)(Math.random( )*10) +1);
            System.out.print(arr1[i]+" ");
            if(i%2!=0)
            {
                sum+=arr1[i];
            }
        }
        System.out.println("\nSum:"+sum);
        //////////////////////////////////////////////////////////////
//         Дано 2 одновимірних масиви(А і В) по К елементів кожен. Утворити третій масив(С) із К * 2 елементів, переписуючи у нього спочатку 
//                 всі елементи масиву А по порядку, а потім елементи масиву В. (random)
int K=10;
 int [] A= new int[K];
  int [] B= new int[K]; 
   int [] C= new int[K*2];
    System.out.println("A:");
        for (int i = 0; i < K; i++) {
            A[i]=( (int)(Math.random( )*100) +1);
            System.out.print(A[i]+" ");
            C[i]=A[i];
        }
        
        
            System.out.println("\nB:");
                 for (int i = 0,j=K; i < K; i++,j++) {
            B[i]=( (int)(Math.random( )*100) +1);
            System.out.print(B[i]+" ");
                 C[j]=B[i];
        }
                 System.out.println("\nC:");
                 for (int i = 0; i < K*2; i++) {
       
            System.out.print(C[i]+" ");
        
        }  
                 /////////////////////////
    }
    
}
