1.to test a number is positive and even?
object Murali  {
  def main(args: Array[String]): Unit = {
    test_Even_Positive(14)
  }
  def test_Even_Positive(a:Int):Int={
    if (a>0 && a%2==0)
      print("positive even number")
    return(a)
  }
}

2 . Range Checker :
object Murali {
  def main(args: Array[String]): Unit = {
    rangeChecker(6)
  }
  def rangeChecker(a:Int):Int={
    if (a<(-10) || a>10)
      print("Number is Out of Range")
    else
      print("Number is in the Range")
    return(a)
  }
}

3. odd but not divisible by 3
object Murali {
  def main(args: Array[String]): Unit = {
    oddNotDiv3(11)
  }
  def oddNotDiv3(a:Int):Int={
    if (a%2 !=0 && a%3 !=0)
      print("yes")
    else
      print("No")
    return(a)
  }
}



4.divisible by 4 or 6
object Murali {
  def main(args: Array[String]): Unit = {
    oddNotDiv3(24)
  }
  def oddNotDiv3(a:Int):Int={
    if (a%4 ==0 || a%6 ==0)
      print("yes")
    else
      print("No")
    return(a)
  }
}

5.test eligibility for voiting / driving
object Murali{
  def main(args: Array[String]): Unit = {
    voting(24)
  }
  def voting(age:Int):Int={
    if (age >= 18)
      print("Eligible for voting /Driving")
    else
      print("Not Eligible for voting /Driving")
    return(age)
  }
}

6.test the range 1 to 10 or 20 to 30
object Murali{
  def main(args: Array[String]): Unit = {
    voting(25)
  }
  def voting(x:Int):Int={
    if (x>=1 && x<=10 || x>=20 && x<=30)
      print("number is in the given range")
    else
      print("number is not in the given range")
    return(x)
  }
}

7.check odd n negative
object Murali{
  def main(args: Array[String]): Unit = {
    check(25)
  }
  def check(x:Int):Int={
    if (x<0 || x%2 !=0)
      print("yes")
    else
      print("no")
    return(x)
  }
}

8.to check a person is eligible for senior citizen discount(age>60)or student discount(age<25)
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    print("Enter your age: ")
    val age = StdIn.readInt()
    if (age<25)
    {
      print("Eligible for Student discount")
    }
    else if (age>60)
    {
      print("Eligible for Senior Citezen discount")
    }
  }
}

9.to check a number is divisible by 5 and 7
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val n = StdIn.readInt()
    if (n%5 ==0 && n%7==0)
    {
      print(n+" is divisible by both 5 and 7")
    }
    else
    {
      print(n+" is not  divisible by both 5 and 7")

    }
  }
}

10)to check a nuber is non negative and even?
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val n = StdIn.readInt()
    if (n%2 ==0 && n>0)
    {
      print(n+" is positive even number")
    }

  }
}

11) check for odd and prime
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val n = StdIn.readInt()
    var cnt = 0
    for(i<-2 until n)
    {
      if (n%i==0)
      {
        cnt =cnt+1}
    }
    if(cnt==0)
      println(n+" is prime number")
    else
      println(n+" is not prime number")

  }
}

12)to check if a customer is eligible for discount (purchase amount > 150 or qualifies for free shipping (purchase amount 100)
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter ur purchase amount: ")
    val amount = StdIn.readInt()
    if (amount>150)
    {
      println("Eligible for discount")
    }
    else if(amount>100)
    {
      println("Eligible for free shipping")
    }
  }
}

13)check a number is divisible by 3 and 8
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val n = StdIn.readInt()
    if (n%3==0 && n%8==0)
    {
      println(n+"  is divisible by 3 and 8")
    }
  }
}

14)check for non positive and even number
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val n = StdIn.readInt()      if (n<0 && n%2==0)
    {
      println(n+"  non positive and even number ")
    }
  }
}

15)age group
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter ur age: ")
    val age = StdIn.readInt()
    if (age>=20)
    {
      println("  Adult ")
    }
    else if (age>=13 && age<20)
    {
      println("  Teeenager ")
    }
    else if (age<13)
    {
      println("  child ")
    }
  }
}

16)divigibility by 2 or 5
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter number: ")
    val n = StdIn.readInt() // Reads an integer
    if (n%2==0)
    {
      println(" divisiblie by 2  ")
    }
    if (n%5==0)
    {
      println(" divisiblie by 5  ")
    }
  }
}

17)
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    print("Enter your age: ")
    val age = StdIn.readInt() // Reads an integer
    if (age<25)
    {
      print("Eligible for Student discount")
    }
    else if (age>60)
    {
      print("Eligible for Senior Citezen discount")
    }
  }
}

18)divisible by 3 and 7
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val n = StdIn.readInt() // Reads an integer
    if (n%3==0 && n%7==0)
    {
      println(n+"  is divisible by 3 and 7")
    }
  }
}

20)Divisible by 5 or 9
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val n = StdIn.readInt() // Reads an integer
    if (n%5==0 || n%9==0)
    {
      println(n+"  is divisible by 5 or 9")
    }
  }
}

22)customer eligible for discount or membership benifits
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    val purchaseAmount = StdIn.readInt()
    val cardAvailability = true
    if (purchaseAmount >=200)
      print("He is eligibil for discount")
    if (cardAvailability)
      print(" He is eligibil for membership benifits")
  }
}



23)
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val n = StdIn.readInt() // Reads an integer
    if (n%3==0 && n%5==0)
    {
      println(n+"  is divisible by 3and 5")
    }
  }
}

24)divisible by 2 or 3
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {

    val n = StdIn.readInt()
    if (n%2==0 || n%3==0 ) {
      println("Divisible by 2 or 3 !")
    }
  }
}

25)+ve and not divisible by 3
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {

    val n = StdIn.readInt()
    if (n>0 && n%3 !=0 ) {
      println("Positive and Divisible by  3 !")
    }
  }
}

26)siiorcitizen discount
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    val isNewCustomer = false
    val age = StdIn.readInt()
    if (age > 65 && !isNewCustomer) {
      println("Eligible for senior citizen discount.")
    } else {
      println("Not eligible for senior citizen discount.")
    }
  }
}

27)odd or prime ?
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    val n= StdIn.readInt()
    var cnt = 0
    for (i <- 2 to Math.sqrt(n).toInt) {
      if (n % i == 0)
        cnt = cnt+1
    }
    if (cnt==0)
      print("its prime number")
    else
      print("its not a prime number")
  }
}

28)Eligible for Discount / Eligible for free shipping ?
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    val purchaseAmt = StdIn.readInt()

    if (purchaseAmt >= 150)
      print("Eligible for discount")

    else if (purchaseAmt >=100)
      print("Eligible fpr Free shipping")

  }
}

29)check given no is non negative and divisible by 7
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    if (n > 0 && n%7 ==0)
      print(n+" Is non negative and divisible by 7")
  }
}
30)eligible for student discount or free trail ?
import scala.io.StdIn
object Murali {
  def main(args: Array[String]): Unit = {
    val age = StdIn.readInt()
    if (age <=25)
      print("He is eligibil for student or free trail")
    else
      print(" He is not eligibil for student or free trail")
  }
}

31)check divisible by 4 or 6
import scala.io.StdIn
object Murali{
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    divby4or6(n)
  }
  def divby4or6(x:Int):Int={
    if (x%4==0 || x%6 ==0)
      print(x+ " is divisible by 4 or 6")
    else
      print(x+ " is not divisible by 4 or 6")
    return(x)
  }
}
