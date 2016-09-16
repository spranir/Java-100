/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobjects;

public class ArrayOfObjects {
 
  
   public static void main(String[] args) {
        
        int[] a= new int[2];
        a[0]=1;
        a[1]=2;
        
        System.out.println(a[0]);
        System.out.println(a[1]);
        
        int[] var= {1,2,3,4,5};
        
        
        for (int i = 0; i < var.length; i++) {
            System.out.println(var[i]);
        }      
int[][] array=new int[2][2];       
        
        array[0][0]=1;
        array[0][1]=2;
        array[1][0]=3;
        array[1][1]=4;
        
  for(int i=0; i<array.length; i++) {
 
               for(int j=0; j<array[1].length; j++)
                   System.out.print(array[i][j] + " ");
               System.out.println();
}  
 
}
 
}

