import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    Scanner in = new Scanner(System.in);           // Creates Scanner object 
    
    System.out.println("Input height (in m): ");
    
    double height = in.nextDouble();              // Read user height input
    
    System.out.println("Input weight (in kg): ");  
    
    double weight = in.nextDouble();             // Read user weight input
    
    double BMI  = weight / (height * height);   // Calculate user BMI 
    
    System.out.print("Your Body Mass Index (BMI) is: " + BMI);  
    
    input.close(); 
  }
}
