import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Alex Smith
 */
public class BankAccountTestJU4 {
	private BankAccount acc1;
	private BankAccount acc2;
	private BankAccount acc3;
	
	
	@Before
	public void intialize() {
		acc1 = new BankAccount(100.0f, "alex".toCharArray(), "1234".toCharArray());
		acc2 = new BankAccount(100.0f, "tyler".toCharArray(), "5678".toCharArray());
		acc3 = null;
	}

	@Test
	public void testBankAccount() {
		//Checks that a BankAccount object is created.
		assertNotNull(new BankAccount(0, null, null));
	}

	@Test
	public void testVerify() {
		//Checks that the verify method returns true for correct credentials. 
		assertEquals(true, acc1.verify(acc1.getUsername(), acc1.getPassword()));
		
		//Checks that the verify method returns false for incorrect credentials. 
		assertEquals(false, acc1.verify(acc2.getUsername(), acc2.getPassword()));
	}

	@Test
	public void testAddToBalance() {
		//Checks that 50.0 was successfully added to the balance of acc1.
		acc1.addToBalance(50.0f);
		assertEquals(150.0f, acc1.getBalance(), 0);
	}

	@Test
	public void testGetCash() {
		//If cash is greater than balance, check that 0.0f is returned.
		assertEquals(0.0f, acc1.getCash(200.0f), 0);
		
		//Otherwise, check that the correct amount is returned
		//and check that the balance has been decreased by the correct amount.
		assertEquals(20.0f, acc1.getCash(20.0f), 0);
		assertEquals(80.0f, acc1.getBalance(), 0);
	}

	@Test (expected = NullPointerException.class)
	public void testMergeAccountsException() {
		//Attempts to merge acc1 with acc3 (a null BankAccount).
		acc1.mergeAccounts(acc3);
	}
	
	@Test 
	public void testMergeAccounts() {
		BankAccount acc;
		
		//Merges acc1 and acc2 into one account called acc.
		acc = acc1.mergeAccounts(acc2);
		
		//Checks that the balance, username, and password of the new account are correct.
		assertEquals(200.0f, acc.getBalance(), 0);
		assertEquals(acc1.getUsername(), acc.getUsername());
		assertEquals(acc1.getPassword(), acc.getPassword());
	}

}
