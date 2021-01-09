/**
 * @author Alex Smith
 */
public class BankAccount {
	
	// Starting balance
	private float balance = 0.0f;
	
	// Username and password
	private char[] username = null;
	private char[] password = null;
	
	
	public BankAccount(float balance, char[] user, char[] pass){
		this.balance = balance;
		this.username = user;
		this.password = pass;
	}
	
	/*
	 * verify user login
	 * 
	 * Corrected the if statement to validate the username and password with .equals().
	 */
	public boolean verify(char[] user, char[] pass){
		boolean valid = false;
		if(username.equals(user) && password.equals(pass)) {
			valid = true;
		}
		
		return valid;
	}
	
	/*
	 * Add amount to the balance
	 */
	public void addToBalance(float deposit){
		balance += deposit;
	}
	
	/*
	 * With draw money
	 * 
	 * Added an if statement to return 0.0f if the user tries to withdraw an amount greater
	 * than the balance of the account.
	 */
	public float getCash(float cash){
		if (balance < cash) {
			return 0.0f;
		}
		
		balance -= cash;
		return cash;
	}
	
	/*
	 * Merge two accounts.
	 */
	public BankAccount mergeAccounts(BankAccount account){
		if(account == null) {
			throw new NullPointerException();
		}
		
		return new BankAccount(this.balance + account.getBalance(), this.username, this.password);
	}
	
	/*
	 * Returns the balance of the account.
	 */	
	public float getBalance() {
		return balance;
	}
	
	/*
	 * Returns the username of the account.
	 */	
	public char[] getUsername() {
		return username;
	}
	
	/*
	 * Returns the password of the account.
	 */	
	public char[] getPassword() {
		return password;
	}
}
