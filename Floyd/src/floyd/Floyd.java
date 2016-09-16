/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd;

  import java.util.Scanner;
 
/**
 *
 * @author -Senthil Siddharth-
 */
public class Floyd {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows which you want in your Floyd Triangle: ");
int r = in.nextInt();
int n=0;
for(int i=0; i<r; i++){
for(int j=0; j<=i; j++){
System.out.print(++n+" ");
}
System.out.println();
}
}
}