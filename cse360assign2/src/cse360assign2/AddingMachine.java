/*
Name: Ankitha Sreekumar
Class ID: 85141
Description: This class adds and subtracts based on the value that is given and also
returns the total of the operations. It also prints out the expression as a string
link to the github repository: https://github.com/asreeku9966/cse360assign2/tree/master/cse360assign2/src/cse360assign2
*/
package cse360assign2;

public class AddingMachine {

	private int total; 
	private StringBuffer calculations;
	
	/**
	 *This method is starts the operations from 0 and appends it to the start of the string of the expression
	 */
	public AddingMachine () { 
		total = 0;  
		calculations = new StringBuffer("0");
	}
	
	/**
	 * This method gets the total from after both the add and subtract methods
	 * @return total, returns the total value
	 */
	public int getTotal () { 
		return total;
	}
	
	/**
	 * This method takes in the param value and adds it to the total
	 * also appends the plus sign and the value into the string of the expression
	 * @param value, accepted input which is added on to the total
	 */
	public void add (int value) { 
		total = total + value;
		calculations.append(" + " + value);
	}
	
	/**
	 * This method takes in the param value and subtracts it to the total
	 * also appends the minus sign and the value into the string of the expression
	 * @param value, accepted input which is subtracted on to the total
	 */
	public void subtract (int value) { 
		total = total - value;
		calculations.append(" - " + value);
	}

	/**
	 * This method returns the string of all the expressions
	 */
	public String toString () { 
		return calculations.toString();
	}

	/**
	 * This method clears the running total and makes it 0
	 */
	public void clear() { 
		total = 0;
	}
}