import java.util.Scanner;
import base.Account;
import base.InsufficientFundsException;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class AccountTest {
	public static void main( String[] args ){
@Before		
		Account account = new Account(1122,20000,4.5);
@After
public void tearDown() throws Exception{
	account = null;
}

@Test
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance is " + account.getBalance());
		System.out.println("Monthly interest is " + account.getMonthlyInterestRate());
		System.out.println("The account was created at " + account.getDateCreated());
	}
	
}
 