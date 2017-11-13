package passwordValidationJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ digitValidation.class, lengthValidation.class, lowerCaseValidation.class, upperCaseValidation.class })
public class PasswordValidationTests {

}
