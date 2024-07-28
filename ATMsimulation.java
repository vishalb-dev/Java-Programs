import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Class containing ATM operations
class ATMoperations
{
    //Method for depositing money
    double DepositMoney(BufferedReader br,double balance) throws IOException     
    {
        System.out.println();
        System.out.println();
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                      ***Deposit Money***                           |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                   Current Balance : Rs. "+balance+"                     |");  
        System.out.println("+--------------------------------------------------------------------+");

        System.out.print("                Enter amount to deposit : Rs. ");
        double damount=Integer.parseInt(br.readLine());
        if(damount>0)
        {
            double newbalance=balance+damount;
            System.out.println();
            System.out.println();
            System.out.println("                Successfully deposited Rs. "+damount);
            System.out.println();
            System.out.println();
            System.out.println("+--------------------------------------------------------------------+");
            System.err.println("|               Previous Balance : Rs. "+balance+"                        |");
            System.out.println("|               Current Balance  : Rs. "+newbalance+"                        |");
            System.out.println("+--------------------------------------------------------------------+");
            return newbalance;

        }
        else
        {
            System.out.println();
            System.out.println();
            System.out.println("                     Invalid Amount!!!");
            return balance;
        }
    }

    //Method for Withdrawing money
    double WithdrawMoney(BufferedReader br,double balance) throws IOException   
    {
        System.out.println();
        System.out.println();
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                      ***Withdraw Money***                          |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                   Current Balance : Rs. "+balance+"                     |");  //displaying current balance
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("                 Enter amount to withdraw : Rs. ");
        double wamount=Integer.parseInt(br.readLine());
        if(wamount>balance)
        {
            System.out.println();
            System.out.println();
            System.out.println("                   Insufficient Balance!!!");
            return balance;
        }
        else
        {
            double newbalance=balance-wamount;
            System.out.println();
            System.out.println();
            System.out.println("                    Withdrawl Successfull!! ");
            System.out.println();
            System.out.println();
            System.out.println("+--------------------------------------------------------------------+");
            System.err.println("|               Previous Balance : Rs. "+balance+"                        |");
            System.out.println("|               Current Balance  : Rs. "+newbalance+"                        |");
            System.out.println("+--------------------------------------------------------------------+");
            return newbalance;
        }
    }

    //Method for changing the pin
    void Changepin(BufferedReader br,int pin) throws IOException
    {
        System.out.println();
        System.out.println();
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                    ***Pin Change***                                |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println();
        System.out.print("                  Enter current pin : ");         //asking the user to enter current pin
        int currentpin=Integer.parseInt(br.readLine());

        if(currentpin==pin)
        {
            System.out.println();
            System.out.println("                       Pin Verified!!");
            System.out.println();
            System.out.println();
            System.out.print("                  Enter new pin : ");         //asking the user to enter new pin
            int newpin=Integer.parseInt(br.readLine());
            System.out.print("                  Confirm new pin : ");       //Confirming the entered new pin
            int confirmpin=Integer.parseInt(br.readLine());
            
            if(newpin==confirmpin)
            {
                System.out.println();
                System.out.println();
                System.out.println("                 Pin changed Successfully!!");
            }
            else
            {
                System.out.println();
               System.out.println("   Error: New pin and confirmation pin do not match. Please try again."); 
            }
        }
        else
        {
            System.out.println();
            System.out.println("                      Invalid pin!!");
        }

    }

}

//Main class to stimulate the ATM operations
public class ATMsimulation
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ATMoperations atm=new ATMoperations();
        double balance=1000.00;     //Initial Balance
        int pin=1234;               
        int choice;

        System.out.println();
        System.out.println("+--------------------------------------------------------------------+ ");
        System.out.println("|                                                                    | ");
        System.out.println("|                   ***WELCOME TO THE ATM MACHINE***                 | ");
        System.out.println("|                                                                    | ");
        System.out.println("+--------------------------------------------------------------------+ ");
        System.out.print("                       Enter pin : ");
        pin=Integer.parseInt(br.readLine());

        if(pin==1234)       //verifying the pin
        {
            System.out.println("\n                   Pin Verified Successfully!!");

            do
            {   //displaying choices 
                System.out.println(); 
                System.out.println();
                System.out.println("+--------------------------------------------------------------------+");
                System.out.println("|                ***PLEASE SELECT AN OPTION***                       |");
                System.out.println("+--------------------------------------------------------------------+");
                System.out.println("|                                                                    |");
                System.out.println("|                 1. Account Balance Inquiry                         |"); 
                System.out.println("|                 2. Deposit Money                                   |");
                System.out.println("|                 3. Withdraw Money                                  |");
                System.out.println("|                 4. Pin change                                      |");
                System.out.println("|                 5. Exit                                            |");
                System.out.println("|                                                                    |");
                System.out.println("+--------------------------------------------------------------------+");

                System.out.print("                 Enter your choice : ");      //asking the user to enter choice
                choice=Integer.parseInt(br.readLine());

                switch(choice)
                {
                    case 1:   //choice 1: Account Balance Inquiry                              
                            System.out.println();
                            System.out.println();
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println("|                   ***Account Balance Inquiry***                    |");
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println("|                   Account Balance : Rs. "+balance+"                     |");
                            System.out.println("+--------------------------------------------------------------------+");
                            break;
                    
                    case 2:    //choice2: Deposit Money
                            balance=atm.DepositMoney(br,balance);
                            break;
                    
                    case 3:   //choice3: Withdraw Money
                            balance=atm.WithdrawMoney(br,balance);
                            break;
                    
                    case 4:   //choice4: Pin change
                            atm.Changepin(br,pin);
                            break;
                    case 5:   //choice5: Exit
                            System.out.println();
                            System.out.println();
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println("|               Thank You for using the ATM. Goodbye!                |");
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println();
                            System.out.println();
                            break;
                }

            }while(choice!=5);
        }
        else
        {
            System.out.println("\n                     Invalid Pin Entered!!");
        }

    }    
}
