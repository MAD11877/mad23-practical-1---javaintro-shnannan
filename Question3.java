import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);    // Creates Scanner Object 
    
    int num = in.nextInt();
    
    int newInt = num * num; 
    
    System.out.println("New multiplied integer: " + newInt);    // Print multiplied integer 
    
    in.close();
  }
}
