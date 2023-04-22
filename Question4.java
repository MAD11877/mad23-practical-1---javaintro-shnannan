import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int r=n; r > 0; r--){       // making the rows 
      for (int c=0; c < r; c++){    // making the columns. inner loop variable resets when the set condition is met and outer loop is run again
        System.out.print("*");      // .print() prints the next item on the same line 
      }
      System.out.println();
    }
    in.close();
  }
}
