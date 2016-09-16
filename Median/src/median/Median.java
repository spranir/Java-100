/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package median;

import java.util.Scanner;

/**
 *
 * @author -Senthil Siddharth-
 */
public class Median {

    public static void main(String[] args) {
        
    
        double median=0;     
        System.out.println("Enter the numbers");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        int mid =0;
        if(n%2==0)
        {
        mid=a[n/2];
        }
        else
        {
            mid=a[mid]+a[mid-1]/2;
        }
        System.out.println("Median is"+mid);
    }
}
    
        
        
        
       