object Recursive extends App{
//Question 01
  def prime(n:Int, i:Int=2):Boolean={
    if(n<=2)
      return {if (n==2) true else false};
    if(n%i==0) return false;
    if(i*i>n) return true;
    return prime(n,i+1)
  }
  print("Question 01:    ");

  println(prime(5));
  println(prime(8));

//Question 02
  def primeSeq(n:Int):Unit = {
    if(n<=1)
      return
    primeSeq(n-1)
    if(prime(n))
      print(n+" ")
  }
  print("Question 02:    ");
  primeSeq(10);

  println();

//Question 03
  def sum(n:Int, total:Int=0): Unit = {
    if(n<=0)
      return print(total)
    sum(n-1,total+n)
  }
  print("Question 03:    ");
  sum(5);

  println();

//Question 04
  def isEven(n:Int):Boolean={
    if(n==0)
      return true;
    if(n==1)
      return false;
    if(n<0) isEven(-n)
    return isEven(n-2)
  }
  print("Question 04:    ");

  println(isEven(14));

//Question 05
  def evenSum(n:Int, total:Int=0):Int={
    if(n<=1)
      return total;
    return evenSum(n-1,total+{if(isEven(n)) n else 0})
  }
  print("question 05:    ");

  println(evenSum(10));

//Question 06
  def fib(n:Int,f:Int=0,m:Int=1):Unit={
    if(n<=0)
      return();
    print(f+" ")
    fib(n-1,m,m+f)
  }
  print("Question 06:    ");

  fib(10);

  println();
}

