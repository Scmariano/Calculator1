package com.codingdojo.calculator;

public class Calculator {
	private double operandone;
	private double operandtwo;
	private String operation;
	private double total;
	
	public Calculator() {}
	public Calculator(double operandone, double operandtwo, String operation) {
		this.operandone = operandone;
		this.operandtwo = operandtwo;
		this.operation = operation;
		
	}
	
	
	public double getOperandOne() {
		return operandone;
	}

	public void setOperandOne(double operandone) {
		this.operandone = operandone;
	}

	public double getOperandTwo() {
		return operandtwo;
	}

	public void setOperandTwo(double operandtwo) {
		this.operandtwo = operandtwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public void performOperation() {
		if(operation.equals("+")) {
			total = operandone + operandtwo;
		}
		else if(operation.equals("-")) {
			total = operandone - operandtwo;
		}
		else {
			System.out.println("Wrong input, try again!");
		}
	}
	
	public double getResults() {
		System.out.println("Total:" + total);
		return total;
	}
	
}
