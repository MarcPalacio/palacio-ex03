/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Marc Palacio
 */

/*
 *    - Write an application
 *      that asks the user for a quote (string input)
 *      then asks the user for the author (string input
 *      prints out quote with the author
 */

package exercise03;
import java.util.*;

public class Solution03 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who is the author? ");
        String author = input.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
