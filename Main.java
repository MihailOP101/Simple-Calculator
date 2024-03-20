
//This is the main class where all the different calculations will be happening
public class Main
{
  private int x;
  private int y;
  //The main method that gets all the numbers and see what needs to be done.
  public static void main(String[] args)
  {
    //Missing the input
    System.out.println("What's the first number?\n");
    System.out.println("\n What's the second number?\n");
  }

  //This method that adds two numbers
  public static int Addition(int x, int y)
  {
    int result = x + y;
    return result;
  }

  //This method subtracts two numbers
  public static int Subtraction(int x, int y)
  {
    int result = x - y;
    return result;
  }

  //This method multiplies two numbers
  public static int Multiply(int x, int y)
  {
    int result = x * y;
    return result;
  }

  //This method divides two numbers
  public static int Divide(int x, int y) 
  {
    if(y == 0)
    {
      return Exception("Cannot divide by 0");
    }
    int result = x / y;
    return result;
  }

  //This is the exception method
  private static int Exception(String string)
  {
    return string;
  }
}
