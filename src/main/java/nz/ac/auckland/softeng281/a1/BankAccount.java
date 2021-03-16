package nz.ac.auckland.softeng281.a1;

/**
 * University of Auckland
 * SOFTENG 281 - SEMESTER 1 - 2021
 * ASSIGNMENT 1 (A1)
 * <p>
 * Bank Account Class
 */
public class BankAccount {
    //TODO implement TASK 2
    // Declare class fields here
    
    /**
     * Construct a BackAccount instance with given initial balance and transactions limit
     *
     * @param initialBalance
     * @param transactionsLimit
     */
    public BankAccount(double initialBalance, int transactionsLimit) {
    	//TODO implement TASK 2
    }

    /**
     * Default constructor
     */
    public BankAccount() {
    	//TODO implement TASK 2
    }

    /**
     * returns the current balance
     *
     * @return
     */
    public double getBalance() {
        //TODO implement TASK 2
        return -1;
    }

    /**
     * return the transaction limit associated to the account
     *
     * @return
     */
    public int getTransactionsLimit() {
        //TODO implement TASK 2
        return -1;
    }
    
    /**
     * Add the given amount to the balance
     *
     * @param amount
     */
    public void deposit(double amount) {
        //TODO implement TASK 3
    }

    /**
     * Subtract the given amount from balance
     *
     * @param amount
     */
    public void withdraw(double amount) {
        //TODO implement TASK 3
    }

    /**
     * Transfer the given amount to Account recipient
     *
     * @param amount
     * @param recipient
     */
    public void transferTo(double amount, BankAccount recipient) {
        //TODO implement  TASK 4
    }

}
