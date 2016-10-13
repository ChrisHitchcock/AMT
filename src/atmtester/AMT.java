/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtester;

/**
 *
 * @author Chris
 */
public class AMT {

    private String bank;
    private double initBal, newBal, currentBal;

    public AMT(String bk, double ib) {
        bank = bk;
        currentBal = ib;
    }

    public double withdraw(double wd) {
        if (wd >= 0) {
            currentBal = currentBal - wd;
            return currentBal;
        } else {
            System.out.println("Please enter a valid (positive) number.");
            return wd;
        }
    }

    public double deposit(double dp) {
        if (dp >= 0) {
            currentBal = currentBal + dp;
            return currentBal;
        } else {
            System.out.println("Please enter a valid (positive) number.");
            return dp;
        }
    }
    
    public double addInterest(double P, double i, int n)
    {
        double dailyInt;
        dailyInt = P*Math.pow((1+i),n);
        System.out.println("Your daily interest is: "+dailyInt);
        return currentBal;
    }

    public String viewBal() {
        String output = "" + currentBal;
        return output;
    }
}
