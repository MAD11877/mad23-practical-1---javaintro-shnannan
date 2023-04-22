import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    // Prompt the user for the number of integers
    int numIntegers = in.nextInt();

    // Read in the integers
    int[] integers = new int[numIntegers];
    for (int i = 0; i < numIntegers; i++) {
      integers[i] = in.nextInt();
    }

    // Calculate the mode (highest occurrence)
    int mode = 0;
    int maxCount = 0;
    for (int i = 0; i < numIntegers; i++) {
      int count = 0;
      for (int j = 0; j < numIntegers; j++) {
        if (integers[j] == integers[i]) {
          count++;
        }
      }
      if (count > maxCount) {
        mode = integers[i];
        maxCount = count;
      }
    }

    // Print out the mode
    System.out.println(mode);
    in.close();
  }
}
