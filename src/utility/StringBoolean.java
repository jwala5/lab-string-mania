package utility;

public class StringBoolean {
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}
// method to check if the string1 contains string2
	public boolean contains(String input1, String input2) {
		boolean output = input1.contains(input2);
		System.out.println(output);
		return output;
	}
// method to to check if the string end with the given letter
	public boolean endsWith(String input1, String input2) {
		boolean output = input1.endsWith(input2);
		return output;
	}
//method to to check if the string starts with the given letter
	public boolean startsWith(String input1, String input2) {
		boolean output = input1.startsWith(input2);
		return output;
	}
//method to to check if two strings are equal
	public boolean equals(String input1, String input2) {
		boolean output = input1.equals(input2);
		return output;
	}
// method to to check if two strings are equal by ignoring the case
	public boolean equalsIgnoreCase(String input1, String input2) {
		boolean output = input1.equalsIgnoreCase(input2);
		return output;
	}

}
