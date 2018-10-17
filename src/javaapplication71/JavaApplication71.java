/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

import java.util.Scanner;

/**
 *
 * @author nabaa96
 */
public class JavaApplication71 {
void comb( Object [] a, Object [] b){
    int g=0;
            int length =a.length+b.length;
    Object [] b1=new Object [length];


    
for(int i=0; i<a.length; i++){
b1[g]=a[i];
b1[g+1]=b[i];
g=g+2;
}





System.out.print("[");
for(int i=0; i<length; i++){
System.out.print(b1[i]+",");


        
        
    }

System.out.print("]");
    
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s= new Scanner(System.in);
                   System.out.println("enter length of your lists");
        int n;
        n=s.nextInt();
  
        Object [] a=new Object[n];
             Object [] b=new Object[n];
JavaApplication71 naba=new JavaApplication71();
   
      
       System.out.println("enter first list");
for(int i=0; i<a.length; i++){
    a[i]=s.next();
 
}
 
 

System.out.println("enter secound list");
for(int i=0; i<b.length; i++){
    b[i]=s.next();

}
   s.close();

   naba.comb(a, b);
   
   
}
}
