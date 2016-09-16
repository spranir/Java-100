/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swappingnumbers;
import java.util.Scanner;

/**
 *
 * @author -Senthil Siddharth-
 */
public class SwappingNumbers 
 
{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the 1st number: ");
int x = in.nextInt();
System.out.println("Enter the 2nd number: ");
int y = in.nextInt();
 
System.out.println("Initial value of x: "+x+" and y: "+y);
 
x = x+y;
y = x-y;
x = x-y;
 
System.out.println("After swapping value of x: "+x+" and y: "+y);
}
}
