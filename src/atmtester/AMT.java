package atmtester;

/**
 * This class is an object that represents a bank; it allows the user to deposit,
 * withdraw, add interest, and view the balance of their bank account.<p>
 * pre: New AMT called <br>
 * post: AMT created/modified
 * @author Chris
 */
public class AMT {
    //Create the details of the AMT
    private String bank;
    private double currentBal;

    /**
     * This constructor takes the inputted name of the bank and the initial balance,
     * and sets those details as the details of the AMT.<p>
     * pre: AMT called with inputted bank name and initial balance<br>
     * post: AMT created with those inputted values
     * @param bk Name of the bank
     * @param ib Initial balance
     */
    public AMT(String bk, double ib) {
        bank = bk;
        currentBal = ib;
    }

    /**
     * This method allows the user to withdraw (remove) money from their account.<p>
     * pre: method called with inputted amount<br>
     * post: that amount is taken from the AMT
     * @param wd Amount being withdrawn.
     * @return currentBal
     */
    public double withdraw(double wd) {
        if (wd >= 0 && wd < currentBal) {
            currentBal = currentBal - wd;
            return currentBal;
        } else  if (wd>=0 && wd>currentBal) {
            System.out.println("You do not have that much money left in your account.");
            return currentBal;
        } else {
            System.out.println("Please enter a valid (positive) number.");
            return currentBal;
        }
    }

    /**
     * This method allows the user to deposit (add) money to their account.<p>
     * pre: method called with inputted amount<br>
     * post: that amount is added to the AMT
     * @param dp Amount being deposited
     * @return currentBal
     */
    public double deposit(double dp) {
        if (dp >= 0) {
            currentBal = currentBal + dp;
            return currentBal;
        } else {
            System.out.println("Please enter a valid (positive) number.");
            return currentBal;
        }
    }

    /**
     * This method allows the user to add interest to their balance.<p>
     * pre: method called with inputted interest rate and days to keep $ invested<br>
     * post: daily interest added to account
     * @param i Interest rate
     * @param n Number of days
     * @return currentBal
     */
    public double addInterest(double i, int n) {
        if (i > 0 && n > 0) {
            currentBal = currentBal * Math.pow((1 + i/365), n);
            return currentBal;
        } else {
            System.out.println("Please enter valid (positive) numbers.");
            return currentBal;
        }
    }

    /**
     * This method allows the user to view the balance of their bank account.<p>
     * pre: method called with final boolean<br>
     * post: output string of balance returned as final or current balance
     * @return output (balance)
     * @param fin Boolean to check if the menu is ending. If so, print the regular message but replace current with final.
     */
    public String viewBal(boolean fin) {
        currentBal = currentBal * 100;
        currentBal = Math.round(currentBal);
        currentBal = currentBal / 100;
        if (fin == false)
        {
            String output = "Your current balance is: $" + currentBal;
            return output;
        } else {
            String output = "Your final balance is: $" + currentBal;
            return output;
        }
    }
}
