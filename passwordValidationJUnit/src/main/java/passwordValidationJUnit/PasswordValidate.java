package passwordValidationJUnit;

public class PasswordValidate {

	private String password;
	
	public PasswordValidate(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public boolean upperCaseValid(String password) {
		boolean valid = false;
		
		for(int i = 0; i < password.length(); i++) {
			char indexCharacter = password.charAt(i);
			boolean charUpperCase = Character.isUpperCase(indexCharacter);
			
			if(charUpperCase == true) {
				valid = true;
			}
		}
		
		return valid;
	}
	
	public boolean lowerCaseValid(String password) {
		boolean valid = false;
		
		for(int i = 0; i < password.length(); i++) {
			char indexCharacter = password.charAt(i);
			boolean charLowerCase = Character.isLowerCase(indexCharacter);
			
			if(charLowerCase == true) {
				valid = true;
			}
		}
		
		return valid;
	}
	
	public boolean lengthValid(String password) {
		boolean valid = false;
		int passwordMinLength = 8;
		
		if(password.length() >= passwordMinLength) {
			valid = true;
		}
		
		return valid;
	}
	
	public boolean digitValid(String password) {
		boolean valid = false;
		
		for(int i = 0; i < password.length(); i++) {
			char indexCharacter = password.charAt(i);
			boolean charDigit = Character.isDigit(indexCharacter);
			
			if(charDigit == true) {
				valid = true;
			}
		}
		
		return valid;
	}
	
}
