import java.io.*;
import java.util.*;
class BankAccount{
String name;
int AccNo;
String type;
double balance;
double wbalance;
String addr;
Scanner s1=new Scanner(System.in);

BankAccount()
{
name="xyz";
AccNo=123;
type="saving";
balance=0.0;
wbalance=0.0;
addr="hyd";
}

void deposit()
{
System.out.println("enter the amount");
balance=s1.nextDouble();
}
void withdraw()
{
if(balance>100)
{
System.out.println("enter the widrawl amount");
wbalance=s1.nextDouble();
balance=balance-wbalance;
}
else
{
System.out.println("insufficient amount");
}
}

void display(){
System.out.println("name of account holder"+name);
System.out.println("addres of account holder"+addr);
System.out.println("account nummber"+AccNo);
System.out.println("widrawal amount"+wbalance);
System.out.println("remainng balance in the account"+balance);
}
}
public class ExecuteAccountC
{
public static void main(String s[])
{
BankAccount ba=new BankAccount();
long AccNo[]=new long[5];
Scanner n=new Scanner(System.in);
System.out.println("enter the account numbers");
for(int i=0;i<5;i++)
{
AccNo[i]=n.nextLong();
}
System.out.println("Number of accounts"+AccNo.length);
System.out.println("Account numbers are ");
for(int i=0;i<AccNo.length;i++)
{
System.out.println(AccNo[i]);
}
ba.deposit();
ba.withdraw();
ba.display();
}
}






