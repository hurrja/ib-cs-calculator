import java.util.Scanner;

public class UserInterface implements AutoCloseable
{
  public UserInterface ()
  {
    scanner = new Scanner (System.in);
  }

  // needed for implementation of AutoCloseable
  @Override
  public void close ()
  {
    if (scanner != null)
      scanner.close ();
  }

  public Expression readExpression ()
  {
    Expression expression = null;
    while (expression == null)
    {
      int op1;
      if (scanner.hasNextInt ())
      {
        op1 = scanner.nextInt ();
        String operation;
        if (scanner.hasNext ())
        {
          operation = scanner.next ();
          int op2;
          if (scanner.hasNextInt ())
          {
            op2 = scanner.nextInt ();

            if (operation.equals ("+"))
              expression = new Add (op1, op2);
          }
        }
      }

      scanner.nextLine ();
    }

    return expression;
  }

  public void showValue (int value)
  {
    System.out.println (value);
  }

  private Scanner scanner;
}
