// Import modules.
import java.util.Scanner;

/** Copyright (c) 2022 Mel Aguoth All rights reserved.
 * This program reverses a string using recursion.
 *
 * @author  Mel Aguoth
 * @version 11.0.13
 * @since 2022-01-14
 */

class ReverseTheString {
  public static String recurseString(String normalString) {

    // If the string is empty, return it as normal.
    if (normalString.isEmpty()) {
      return normalString;

    // If the string isn't empty, recurse it with it's first character at the end.
    } else {
      return recurseString(normalString.substring(1)) + normalString.charAt(0);
    }
  }

  public static void main(String[] args) {

    // Introduce the program.
    System.out.print("This program reverses a given string using recursion.");
 
    // Get the user's string.
    Scanner input = new Scanner(System.in);
    System.out.print("\n" + "Enter your string: ");
    String userString = input.next();
    input.close();

    // Call recurseString.
    final String reversedString = recurseString(userString);

    // Display the reversed string.
    System.out.print("\n" + "The reverse of '" + userString + "' is: " + reversedString + "\n");
  }
}
