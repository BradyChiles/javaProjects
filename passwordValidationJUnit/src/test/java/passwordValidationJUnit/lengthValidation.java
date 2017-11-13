package passwordValidationJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lengthValidation {

	protected PasswordValidate goodPassword, badPassword;
	
	@Before
	public void setUp() throws Exception {
		goodPassword = new PasswordValidate("BradyChiles");
		badPassword = new PasswordValidate("Brady");
	}

	@Test
	public void testlLengthValid() {
		String password = goodPassword.getPassword();
		assertTrue(goodPassword.lengthValid(password));
	}
	
	@Test
	public void testLengthInvalid() {
		String password = badPassword.getPassword();
		assertFalse(badPassword.lengthValid(password));
	}
}
