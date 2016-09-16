/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revnumstring;

import java.util.*;

public class RevNumString 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Please enter a string: ");
        String str = scanner.next();

        RevNumString rns = new RevNumString();
        int revNum = rns.reverse(num);
        String revStr = rns.reverse(str);
        
        System.out.printf("\n The reverse of number %d is %d ", num, revNum);
        System.out.printf("\n The reverse of string '%s' is '%s' ", str, revStr);
    }
    
    public int reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
    }
    
    public String reverse(String str) {
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }
}
