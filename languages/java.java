
// 1. Example ----------------------------

/*
  Reverse Number using Java
  This Java Reverse Number Example shows how to reverse a given number.
*/

public class ReverseNumber {

  public static void main(String[] args) {

    //original number
    int number = 1234;
    int reversedNumber = 0;
    int temp = 0;

    while(number > 0){
      //use modulus operator to strip off the last digit
      temp = number%10;

      //create the reversed number
      reversedNumber = reversedNumber * 10 + temp;
      number = number/10;
    }

    //output the reversed number
    System.out.println("Reversed Number is: " + reversedNumber);
  }
}


// 2. Tests ----------------------------

package com.somedomain.here;

import java.io.File;
import static java.io.File.*;

// line comment
/* multi-line comment */
