/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author -Senthil Siddharth-
 */
public class Prime {

    public static void main(String[] args) {
                     
            System.out.println("Enter the prime number");
            Scanner in=new Scanner(System.in);
                
               int n;
        n = in.nextInt();
                
               
                //loop through the numbers one by 
                for(int i=1; i < n; i++){
                       
                        boolean isPrime = true;
                       
                        //check to see if the number is prime
                        for(int j=2; j < i ; j++){
                               
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                        // print the number
                        if(isPrime)
                                System.out.print(i + " ");
                }
        }
}