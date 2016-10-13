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
public class ATMTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AMT test = new AMT("CIBC", 1000);
        
        test.withdraw(-100);
        test.deposit(200);
        test.addInterest(1000,50,5);
        
        System.out.println(test.viewBal());
    }
    
}
