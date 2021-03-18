package nz.ac.auckland.softeng281.a1;

/**
 * University of Auckland
 * SOFTENG 281 - SEMESTER 1 - 2021
 * ASSIGNMENT 1 (A1)
 * <p>
 * Bank Account Class
 */
public class BankAccount {
    // Declare class fields here
    private double initialBalance;
    private int transactionsLimit;
    private int transactionsSoFar;
    
    /**
     * Construct a BackAccount instance with given initial balance and transactions limit
     *
     * @param initialBalance
     * @param transactionsLimit
     */
    public BankAccount(double initialBalance, int transactionsLimit) {
    	this.initialBalance = initialBalance;
      this.transactionsLimit = transactionsLimit;
    }

    /**
     * Default constructor
     */
    public BankAccount() {
    	this.initialBalance = 0.0;
      this.transactionsLimit = 10;
      this.transactionsSoFar = 0;
    }

    /**
     * returns the current balance
     *
     * @return
     */
    public double getBalance() {
        return initialBalance;
    }

    /**
     * return the transaction limit associated to the account
     *
     * @return
     */
    public int getTransactionsLimit() {
        return transactionsLimit;
    }
    
    /**
     * Add the given amount to the balance
     *
     * @param amount
     */
    public void deposit(double amount) {
        if (this.transactionsSoFar == this.transactionsLimit) {
          System.out.println("transactions limit reached");
          return;
        } else {
          this.initialBalance += amount; 
          this.transactionsSoFar++;
          return;
        }
    }

    /**
     * Subtract the given amount from balance
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (this.transactionsSoFar == this.transactionsLimit) {
          System.out.println("transactions limit reached");
          return;
        } else if (this.initialBalance >= amount) {
          this.initialBalance -= amount;
          this.transactionsSoFar++;
          return;
        } else {
          System.out.println("amount exceeded");
          return;
        }
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
