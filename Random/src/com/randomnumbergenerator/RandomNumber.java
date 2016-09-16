package com.randomnumbergenerator;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

 
 public static void main(String[] args) {
  
  Scanner in = new Scanner(System.in);
  System.out.println("Enter minimum number");
  int minimum=in.nextInt();
  
  System.out.println("Enter maximum number");
  int maximum=in.nextInt();
  
  Random rn = new Random();
  int range = maximum - minimum + 1;
  int randomNum =  rn.nextInt(range) + minimum;
  
  System.out.println("Random Number= "+randomNum);

 }

}