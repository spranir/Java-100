/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;
import java.util.Scanner;
 
public class OddorEven{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter a number which you want to check whether that is even or odd");
int n = in.nextInt();
 
if(n%2==0){
System.out.println(n+" is an even number.");
}else{
System.out.println(n+" is an odd number.");
 
}
}
}

