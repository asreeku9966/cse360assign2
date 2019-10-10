package cse360assign2;

public class AddingMachine {

	private int total;
	private StringBuffer calculations;
	
	public AddingMachine () { //starts the program and appends 0
		total = 0;  
		calculations = new StringBuffer("0");
	}
	
	public int getTotal () { //returns the total of the calculations
		return total;
	}
	
	public void add (int value) { //adds the given value to either 0 or other expressions
		total = total + value;
		calculations.append(" + " + value);
	}
	
	public void subtract (int value) { //subtracts the given value to either 0 or other expressions
		total = total - value;
		calculations.append(" - " + value);
	}

	public String toString () { //converts expression to strings
		return calculations.toString();
	}

	public void clear() { //clears all calculations and turns it into 0
		total = 0;
	}
}