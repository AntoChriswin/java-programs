package javaeclipse;
import java.util.Scanner;
 class bank {
    int bal = 0;
    int c,a,b;
    Scanner sc = new Scanner(System.in);
    void getdata()
    {
        System.out.print("enter acc number : ");
        a = sc.nextInt();
        System.out.print("enter your current balance : ");
        b = sc.nextInt();
        bal = bal + b;
    }
    int in()
    {
        System.out.println("menu : ");
        System.out.println("view balance - 1 ");
        System.out.println("to withdraw - 2 ");
        System.out.println("to deposit - 3 ");
        System.out.println("exit - 4 ");
        System.out.print("enter - ");
        c = sc.nextInt();
        return c;
        //sc.close();
    }   
}
class process extends bank {
    void balance() {
        System.out.println("balance = " + bal);
    }
    void withdraw() {
    	int z;
    	System.out.print("enter amount to withdraw : 1");
    	z = sc.nextInt();
    	if(z<bal)
    	{
    		bal = bal - z;
    		System.out.print("remaining balance - "+bal);
    	}
    	else
    	{
    		System.out.print(" insufficient balance ");
    	}
    }
    void deposit() {
    	int d;
    	System.out.print("enter amount to deposit : ");
    	d = sc.nextInt();
    	bal = bal + d;
    	System.out.print("current balance = "+bal);
    	sc.close();
    }
}
class result{
    public static void main(String[] args)
    {
    	int r;
        process p = new process();
        p.getdata();
        
        while (true)
        {
        	r = p.in();
        	if (r == 1)
        	{
        		p.balance();
        	}
        	else if(r==2)
        	{
        		p.withdraw();
        	}
        	else if(r==3)
        	{
        		p.deposit();
        	}
        	else if(r == 4)
        	{
        		System.out.print("exiting....");
        		break;
        	}
        }
    }

}
