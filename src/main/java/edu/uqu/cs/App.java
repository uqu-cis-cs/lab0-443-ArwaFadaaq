package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/

    public static void main(String [] args) {

    Scanner input=new Scanner(System.in);   

        /* Write your code here */

       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)
       twisters();
       System.out.println("\n Enter a string");
       String str=input.nextLine().toLowerCase();
       phoneKeypad(str);
       input.close();

    }

    public static void twisters(){
        for (int count=1;count<=110;count++){
            if (count%2==0){
                System.out.print("Tweetle");
                if (count%4==0){
                System.out.print("Beetle");
                }
                if (count%6==0){
                System.out.print("Poodle");
                }
                System.out.print(" ");
            }
            else {
            System.out.print(count+" ");
            }

        }
    }

    public static void phoneKeypad(String str){
        int len=str.length();
        for(int count=0;count<len;count++){
            char letter=str.charAt(count);
            if (letter>='a'&&letter<='c'){
                System.out.print(2);
            }
            else if (letter>='d'&&letter<='f'){
                System.out.print(3);
            }
            else if(letter>='g'&&letter<='i'){
                System.out.print(4);
            }
            else if (letter>='j'&&letter<='l'){
                System.out.print(5);
            }
            else if (letter>='m'&&letter<='o'){
                System.out.print(6);
            }
            else if (letter>='p'&&letter<='s'){
                System.out.print(7);
            }
            else if (letter>='t'&&letter<='v'){
                System.out.print(8);
            }
            else if (letter>='w'&&letter<='z'){
                System.out.print(9);
            }

        }

    }


}