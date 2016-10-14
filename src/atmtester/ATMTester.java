/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtester;

import java.util.*;

/**
 * This program tests the AMT class.
 *
 * @author Chris
 */
public class ATMTester {

    /**
     * Everything happens here
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables and such.
        Scanner kb = new Scanner(System.in);
        boolean menu;
        String end;
        int choice;

        //Obtain the name of the bank and init. balance, and set those as the parameters of the AMT.
        System.out.println("Please enter the name of your bank.");
        String bankName = kb.next();
         System.out.println("Please enter your intial balance.");
        AMT bank = new AMT(bankName, kb.nextDouble());

        //While loop; keep popping up the menu until told not to.
        menu = true;
        while (menu == true) {
            //Menu and choice selection
            System.out.println(bankName + "\n1.\tDeposit Money\n2.\tWithdraw Money\n3.\tAdd Interest\n4.\tView Balance\n5.\tExit");
            choice = kb.nextInt();

            //If statements regarding the selected choice.
            //Deposit money
            if (choice == 1) {
                int amount;
                System.out.println("How much are you depositing?");
                amount = kb.nextInt();
                bank.deposit(amount);
            } else 
            //Withdraw money
            if (choice == 2) {
                int amount;
                System.out.println("How much are you withdrawing?");
                amount = kb.nextInt();
                bank.withdraw(amount);
            } else 
            //Add interest to balance
            if (choice == 3) {
                double i;
                int n;
                System.out.println("Please enter the interest rate (%) and amount of days "
                        + "to leave the balance invested, individually.");
                i = (kb.nextDouble()/100);
                n = kb.nextInt();
                bank.addInterest(i, n);
            } else 
            //View Balance
            if (choice == 4) {
                System.out.println(bank.viewBal(false));
            } else
            //Exit
            if (choice == 5)
            {
                menu=false;
            }
            
            //Prompt regarding the while loop. If yes, while loop ends, if no, while loop continues.
            if (menu==true)
            {
                System.out.println("Are you done?");
                end = kb.next();
                if (end.equalsIgnoreCase("yes")) {
                    menu = false;
                } else {
                    menu = true;
                }
            }
        }
        //Show the final balance
        System.out.println("Final Balance: "+bank.viewBal(true));
    }

}
