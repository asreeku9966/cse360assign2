package cse360assign2;

public class test {
	public static void main(String[] args) {
		
		AddingMachine myCalculator = new AddingMachine(); //create a new object file
		//test cases
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.add(1);
		myCalculator.add(2);
		myCalculator.subtract(3);
		myCalculator.add(4);
		myCalculator.add(5);
		
		System.out.println(myCalculator.toString()); //returning the string
	}

}
