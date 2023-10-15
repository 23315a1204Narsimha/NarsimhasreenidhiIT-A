import java.io.*;
import java.util.*;
class BankAccount{
String name;
int AccNo,AccNo2,AccNo3,AccNo4,AccNo5,count;
String type;
double balance;
double wbalance;
String addr;
Scanner s1=new Scanner(System.in);

BankAccount()
{
name="xyz";
type="saving";
balance=0.0;
wbalance=0.0;
addr="hyd";
count=0;
System.out.println("enter the account numbers");
AccNo=s1.nextInt();
count++;
AccNo2=s1.nextInt();
count++;
AccNo3=s1.nextInt();
count++;
AccNo4=s1.nextInt();
count++;
AccNo5=s1.nextInt();
count++;
System.out.println("number of accounts in the bank"+count);

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

System.out.println("widrawal amount"+wbalance);
System.out.println("remainng balance in the account"+balance);
System.out.println("account nummber"+AccNo);
System.out.println("account nummber"+AccNo2);
System.out.println("account nummber"+AccNo3);
System.out.println("account nummber"+AccNo4);
System.out.println("account nummber"+AccNo5);
}
}
public class ExecuteAccountB
{
public static void main(String s[])
{
BankAccount ba=new BankAccount();
ba.deposit();
ba.withdraw();
ba.display();
}
}






