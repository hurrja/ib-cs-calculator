public abstract class Expression
{
  public Expression (int op1, int op2)
  {
    this.op1 = op1;
    this.op2 = op2;
  }

  public int getOp1 ()
  {
    return op1;
  }
  
  public int getOp2 ()
  {
    return op2;
  }

  abstract public int evaluate ();

  int op1, op2;
}
