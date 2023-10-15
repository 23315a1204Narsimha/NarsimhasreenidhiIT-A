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

BankAccount(String name,int AccNo,String type,String addr)
{
this.name=name;
this.AccNo=AccNo;
this.type=type;
this.addr=addr;
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
public class ExecuteAccountD
{
public static void main(String s[])
{
BankAccount ba=new BankAccount("abc",123,"current","knr");
ba.deposit();
ba.withdraw();
ba.display();
}
}






