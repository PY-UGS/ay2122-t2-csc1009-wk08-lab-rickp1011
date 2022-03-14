package lab;

import org.junit.Test;

import java.util.Scanner;
public class banktestclass {
    @Test
    public void lab8Q2whatif()
    {
        Scanner input = new Scanner(System.in);
        checkaccount acct = new checkaccount(9094321,0);
        double depositvalue = 4000;
        double value = 4000;
        acct.deposit(depositvalue);
        try
        {
            if (value<=depositvalue)
            {
                acct.withdraw(value);
                System.out.println("the balnce after withdraw is "+ acct.balance);
            }
            else
            {
                throw new InsufficientFundsException(value);
            }
        }
        catch(InsufficientFundsException e)
        {
            double shortage = value - acct.balance;
            System.out.println("“Sorry, but your account is short by: "+ shortage);
        }
    }
    @Test
    public void lab8Q2testifvaluemorethanthhevalue()
    {
        Scanner input = new Scanner(System.in);
        checkaccount acct = new checkaccount(9094321,0);
        double depositvalue = 4000;
        double value = 5000;
        acct.deposit(depositvalue);
        try
        {
            if (value<=depositvalue)
            {
                acct.withdraw(value);
                System.out.println("the balnce after withdraw is "+ acct.balance);
            }
            else
            {
                throw new InsufficientFundsException(value);
            }
        }
        catch(InsufficientFundsException e)
        {
            double shortage = value - acct.balance;
            System.out.println("“Sorry, but your account is short by: "+ shortage);
        }
    }
    @Test
    public void lab8Q2testifvaluelessthanthhevalue()
    {
        Scanner input = new Scanner(System.in);
        checkaccount acct = new checkaccount(9094321,0);
        double depositvalue = 4000;
        double value = 3000;
        acct.deposit(depositvalue);
        try
        {
            if (value<=depositvalue)
            {
                acct.withdraw(value);
                System.out.println("the balnce after withdraw is "+ acct.balance);
            }
            else
            {
                throw new InsufficientFundsException(value);
            }
        }
        catch(InsufficientFundsException e)
        {
            double shortage = value - acct.balance;
            System.out.println("“Sorry, but your account is short by: "+ shortage);
        }
    }
    }

