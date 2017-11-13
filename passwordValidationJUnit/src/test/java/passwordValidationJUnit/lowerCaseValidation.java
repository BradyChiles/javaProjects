package passwordValidationJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lowerCaseValidation {

	protected PasswordValidate goodPassword, badPassword;
	
	@Before
	public void setUp() throws Exception {
		goodPassword = new PasswordValidate("brady");
		badPassword = new PasswordValidate("BRADY");
	}

	@Test
	public void testLowerCaseValid() {
		String password = goodPassword.getPassword();
		assertTrue(goodPassword.lowerCaseValid(password));
	}
	
	@Test
	public void testLowerCaseInvalid() {
		String password = badPassword.getPassword();
		assertFalse(badPassword.lowerCaseValid(password));
	}
}
