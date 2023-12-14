import java.util.*;
class InsufficientException extends Exception
{
double withdrawAmount;
double balance;
public InsufficientException(String msg)
{
super(msg);
}
void withdraw()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your balance:");
balance=sc.nextDouble();
System.out.println("Enter the Withdraw amount:");
withdrawAmount=sc.nextDouble();
try{
if(withdrawAmount>balance)
{
throw new InsufficientException("Insufficient Balance...");
}
else
{
balance=balance-withdrawAmount;
System.out.println("Remaining balance is:"+balance);
}
}
catch(InsufficientException i)
{
System.out.println("exception is:"+i.getMessage());
}
}
}
class ExceptionDemo
{
public static void main(String args[])
{
InsufficientException ie=new InsufficientException("Insufficient Balance...");
ie.withdraw();
}
}