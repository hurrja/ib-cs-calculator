public class Divide extends Expression
{
  public Divide (int op1, int op2)
  {
    super (op1, op2);
  }

  @Override
  public int evaluate ()
  {
    return op1 / op2;
  }
}
