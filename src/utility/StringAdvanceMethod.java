package utility;

public class StringAdvanceMethod {
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
//method to concatenate two strings
	public String concat(String input1, String input2) {
		String output = input1 + input2;
		return output;
	}
//method to split the first string based on the second string value
	public String split(String input1, String input2) {
		String output[] = input1.split(input2);
		return output[0] + "  " + output[1];
	}
//method to find the index value of the given character in the first string
	public String indexOf(String input1, String input2) {
		String output = String.valueOf(input1.indexOf(input2));
		return output;
	}

}
