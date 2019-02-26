package cse360assign2;

/**
 * This program is a basic calculator that performs addition, subtraction,
 * multiplication, and division on integers passed in by the user. It stores
 * and displays the current total and the calculation history.
 * 
 * @author  Sophia Nordlie class ID: 513
 * @version 1.1
 * @since   2019-02-25
 */
public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * Calculator – This is the constructor for the calculator.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal – This method returns the result of the calculation(s) 
	 * performed as an integer. 
	 * @return int This returns the calculated result.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add – This method takes in an integer and adds it to the current total.
	 * @param value This is an integer passed by the user.
	 */
	public void add (int value) {
		total = value + total;
		history = history + " + " + value;
	}
	
	/**
	 * subtract – This method takes in an integer and subtracts it from the 
	 * current total.
	 * @param value This is an integer passed by the user.
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * multiply – This method multiplies the current total by the integer passed to it.
	 * @param value This is an integer passed by the user.
	 */
	public void multiply (int value) {
		total = value * total;
		history = history + " * " + value;
	}
	
	/**
	 * divide – This method divides the current total by the integer passed to it.
	 * @param value This is an integer passed by the user.
	 */
	public void divide (int value) {
		if (value != 0) {
			total = total / value;
		}
		else {
			total = 0;
		}
		history = history + " / " + value;
	}
	
	/**
	 * getHistory – This method returns the calculation history as a String.
	 * @return String This is the calculation history.
	 */
	public String getHistory () {
		return history;
	}

}
