package passwordValidationJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class digitValidation {

	protected PasswordValidate goodPassword, badPassword;
	
	@Before
	public void setUp() throws Exception {
		goodPassword = new PasswordValidate("Brady94");
		badPassword = new PasswordValidate("Brady");
	}

	@Test
	public void testDigitValid() {
		String password = goodPassword.getPassword();
		assertTrue(goodPassword.digitValid(password));
	}
	
	@Test
	public void testDigitInvalid() {
		String password = badPassword.getPassword();
		assertFalse(badPassword.digitValid(password));
	}
}
