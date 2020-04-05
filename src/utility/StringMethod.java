package utility;

public class StringMethod {
	private String input;
	
//for displaying input of the string
	public String getInput() {
		return input;
	}
	
// for setting input of string
	public void setInput(String input) {
		this.input = input;
	}
	
// convert string to lowercase
	public String lower(String input) {
		String output = input.toLowerCase();
		return output;

	}
//convert string to uppercase

	public String upper(String input) {
		String output = input.toUpperCase();
		return output;
	}
// method to find first character of string

	public String firstCharacter(String input) {
		String output = Character.toString(input.charAt(0));
		return output;
	}
//method to return string length
	
	public String length(String input) {
		String output = String.valueOf(input.length());
		return output;
	}
// method for trimming string

	public String trim(String input) {
		String output = input.trim();
		return output;
	}

}
