package functions;

import java.util.Scanner;
class ShowRoom
{
    String name;
    long mobno;
    double cost,dis,amount;

    ShowRoom()       //default constructor
    {
        name = " ";
        mobno = 0L;
        cost = 0.0d;
        dis = 0.0d;
        amount = 0.0d;

    }
    void input ()
    {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = kb.nextLine();
        System.out.println("Enter your mobile number : ");
        mobno = kb.nextLong();
        System.out.println("Enter the cost of the item purchased : ");
        cost = kb.nextDouble();
    }
    void calculate ()
    {
        if(cost<=10000)
        {
            dis = cost * 5/100;
            amount = cost - dis;
        }
        else if(cost > 10000 && cost <= 20000)
        {
            dis = cost * 10/100;
            amount = cost - dis;
        }
        else if (cost > 20000 && cost <= 35000)
        {
            dis = cost * 15/100 ;
            amount = cost - dis;
        }
        else if (cost > 35000)
        {
            dis = cost * 20/100;
            amount = cost - dis;
        }
    }
    void display()
    {
        System.out.println("Name of the customer : " + this.name);
        System.out.println("Mobile Number : " + this.mobno);
        System.out.println("Amount to be paid after discount: "+ this.amount);
    }
    public static void main(String[ ]args)
    {
        ShowRoom s = new ShowRoom();
        s.input( ) ;
        s.calculate( ) ;
        s.display( ) ;
    }
}