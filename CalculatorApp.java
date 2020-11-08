public class CalculatorApp
{
  public static void main (String[] args)
  {
    try (UserInterface ui = new UserInterface ())
    {
      while (true)
      {
        Expression expression = ui.readExpression ();
        int value = expression.evaluate ();
        ui.showValue (value);
      }
    }
  }
}
