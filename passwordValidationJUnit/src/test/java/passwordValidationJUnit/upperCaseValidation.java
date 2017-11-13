package passwordValidationJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class upperCaseValidation{
	
	protected PasswordValidate goodPassword, badPassword;
	
	@Before
	public void setUp() throws Exception {
		goodPassword = new PasswordValidate("Brady");
		badPassword = new PasswordValidate("brady");
		
	}

	@Test
	public void testUpperCaseValid() {
		String password = goodPassword.getPassword();
		assertTrue(goodPassword.upperCaseValid(password));
	}
	
	@Test
	public void testUpperCaseInvalid() {
		String password = badPassword.getPassword();
		assertFalse(badPassword.upperCaseValid(password));
	}

}
