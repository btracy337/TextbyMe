package controller;

import java.util.Scanner;

//this is what comments look like.

public class Controller
{
	public void start()
	{
		moreInput();
		evenmoreQuestions();
		questions();

	}

	private void questions()
	// Scanner (calling for a scanner.) inputScanner (Name about the scanner) = new
	// (initializes) Scanner(System.in) tells the scanner to recieve input from
	// keyboard.
	// constructor builds the object
	{
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		System.out.println("How is your day today?");
		// There is no string in front of answer because it was already done in line 20.
		answer = inputScanner.nextLine();
		System.out.println(answer);
		System.out.println("On a scale fro,m 1-10 how much do you like school?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		inputScanner.close();
		// close every single scanner for information purposes.
	}

	private void moreInput()
	{
		Scanner anotherInputScanner = new Scanner(System.in);
		System.out.println("What is the meaning of life, the universe, and everything?");
		int answer = anotherInputScanner.nextInt();
		System.out.println("You typed: " + answer);
		if (answer == 42)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		anotherInputScanner.nextLine(); // used to consume the enter key press, ignoring the return String value.
		System.out.println("Words - why the error?");
		String secondResponse = anotherInputScanner.nextLine();
		System.out.println(secondResponse);
		// double holds real number aka numbers with a decimal point.
		double magicNumber;
		System.out.println("Type in your favorite number with a decimal.");
		magicNumber = anotherInputScanner.nextDouble();
		System.out.println(magicNumber);
		// anotherInputScanner.close();
	}

	private void evenmoreQuestions()
	{
		Scanner lastinputScanner = new Scanner(System.in);
		System.out.println("How are you doing today?");
		String answer = lastinputScanner.nextLine();
		if (answer.equals("bad"))
		{
			System.out.println("Hope you do better in the future!");
		}
		else
		{
			System.out.println("Glad you're doing okay!");
		}
		
		

	}
	
	public boolean validInt(String example)
	{
		boolean isValid = false;
			try 
			{
				Integer.parseInt(example);
				isValid= true;
			}
			catch(NumberFormatException error)
			{
				System.out.println("Type in a valid int value human!");
			}
		return isValid;
	}
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating point values are allowed for input.");
		}
		return isValid;
	}
}
