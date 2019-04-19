package com.poho.exceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getInput();
		} catch (EvenNumberException e) {
			e.printStackTrace();
		}

	}
	
	public static void getInput() throws EvenNumberException { //we've made the method static, so that we won't need an instance of Simulation in order to call it
		Scanner in = new Scanner(System.in);
		
		//get input from user
		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You've typed: " + line);
		
		//test if number is even, throw exception if true
		if (isEven(line)) {
			try {
				throw new EvenNumberException();
			}finally {
			//close resources
			in.close();
			}
		}
		
		in.close();
	}
	
	public static boolean isEven(String num) {
		//convert value to a number
		int value = Integer.parseInt(num);
		
		return(value%2 == 0);
	}

}
