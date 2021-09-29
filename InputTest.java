import java.util.Scanner;

import javax.swing.JOptionPane;


public class InputTest {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int starterChoice;
		Scanner sC = new Scanner(System.in);
		System.out.println("Enter Program Choice: "); // starts program
		System.out.println("Type 1 for Collatz Calculation");
		System.out.println("Type 2 for General Calculator");
		System.out.println("Type 3 for Guessing Game");
		System.out.println("Type 4 for Prime Number Checker");
		starterChoice = sC.nextInt();
		System.out.println("You chose option " + starterChoice + "\n");
		
		if (starterChoice == 1 ) { // starts Collatz Calculator 
			startCollatzCalculation();
		} else if (starterChoice == 2) {  
			startGeneralCalculator();
		} else if (starterChoice == 3) {
			startGuessingGame();
		} else if (starterChoice == 4) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Number for Prime Number Check");
			int inputSend = input.nextInt();
			boolean isPrime = startPrimeTest(inputSend);
			if (isPrime == true) {
				System.out.println(inputSend + " is a prime number");
			} else if (isPrime == false) {
				System.out.println(inputSend + " is not a prime number");
			}
		} else if (starterChoice == 5) {
			throw new IllegalArgumentException("Option 5 not implemented");
		}
	}
	/*
	 * @param Starts Collatz Calculation
	 */
	public static void startCollatzCalculation() {
		System.out.println(
				"|-------------------------------|" + "\n" +
				"|-Welcome to Collatz Calculator-|" + "\n" +
				"|-------------------------------|" + "\n" + "\n");
		Scanner Input = new Scanner(System.in);
		int collatzChoice;
		Scanner cC = new Scanner(System.in);
		System.out.println("Choose an option: " + "\n" + // starts Calculator Options
						   "-----------------" + "\n"); 		
		System.out.println("1. Simple Collatz Calculation");
		System.out.println("2. Printed Sequence of Collatz Calculations");
		System.out.println("3. Numerical Printed Sequences of Collatz Calculations");
		System.out.println("4. Lifespan of a Collatz Calculations");
		System.out.println("5. Maximum Number Calculated during Collatz Calculation");
		System.out.println("6. Printed Lifespans of Collatz Calculations");
		System.out.println("7. Collatz Lifespan Search");
		System.out.println("8. Printed Lifespan Sequence");
		collatzChoice = cC.nextInt();
		System.out.println("You chose option " + collatzChoice);
		ifDecider(collatzChoice);
	}
	static void ifDecider(int collatzChoice) {
		if (collatzChoice == 1) { // starts #1 collatz calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number for Collatz Calculation");
			wantedCollatz = wC.nextInt();
			int returned = collatz(wantedCollatz);
			System.out.println(returned);
			JOptionPane.showMessageDialog(null, returned);
		} else if (collatzChoice == 2) { // Starts #2 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number for Sequence Calculation");
			wantedCollatz = wC.nextInt();
			printSequence(wantedCollatz);
		} else if (collatzChoice == 3) { // Starts #3 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number for Sequencial Output");
			wantedCollatz = wC.nextInt();
			printSequences(wantedCollatz);
		} else if (collatzChoice == 4) { // Starts #4 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number for Lifespan Calculation");
			wantedCollatz = wC.nextInt();
			System.out.println((collatzLifespan(wantedCollatz)));
		} else if (collatzChoice == 5) { // Starts #5 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number for Maximum Number Reached Calculation");
			wantedCollatz = wC.nextInt();
			System.out.println(collatzMaximum(wantedCollatz));
		} else if (collatzChoice == 6) { // Starts #6 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number for Printed Lifespans");
			wantedCollatz = wC.nextInt();
			printLifespans(wantedCollatz);
		} else if (collatzChoice == 7) { // Start #7 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number Collatz Lifespan Search");
			wantedCollatz = wC.nextInt();
			System.out.println(collatzLifespanSearch(wantedCollatz));
		} else if (collatzChoice == 8) { // Start #8 Collatz Calculation
			Scanner collatzInput = new Scanner(System.in);
			int wantedCollatz;
			Scanner wC = new Scanner(System.in);
			System.out.println("Input Number Printed Lifespan Search");
			wantedCollatz = wC.nextInt();
			printLifespanSequence(wantedCollatz);
		} else if (collatzChoice < 0 || collatzChoice > 8) { // Throws exception if entered number breaches bounds
			//throw new IllegalArgumentException("Invalid Input Choice");
			System.out.println("Input must be between 1 and 8");
			startCollatzCalculation();
		}
	}
	
	/*
	 * Calculation Methods
	 */
	
	static int collatz(int input) {
		int helper = input;
		if (helper % 2 == 0) {
			return helper/2;
		} else {
			return 3 * helper + 1;
		}
	}
	static void printSequence(int input)  {
		System.out.print(input + " ");
		while (input != 1) {
			input = collatz(input);
			System.out.print(input + " ");
		}
		
	}
	static void printSequences(int input) {
		int sequenceCounter = 1;
        while (sequenceCounter <= input) {
            printSequence(sequenceCounter); 
            sequenceCounter++; 
            System.out.println(); 

        }
	}
	static int collatzLifespan(int input) {
		int counter = 0;
        while (input != 1) {
            input = collatz(input);
            counter++; 
        }
        return counter;
	}
	static int collatzMaximum(int input) {
		int highFinal = 1; 
        while (input != 1) {
            input = collatz(input);
            if (input > highFinal) { 
                highFinal = input;
            }
        }
        return highFinal;
	}
	static void printLifespans(int input) {
		int sequenceCounter = 1; 
        while (sequenceCounter <= input) {
            System.out.println(sequenceCounter + ": " + collatzLifespan(sequenceCounter)); 
            sequenceCounter++;
        }
	}
	static int collatzLifespanSearch(int input) {
		int lifespanTest = 0;
        int n = 0;        
        while (lifespanTest != input) {
            n++;
            lifespanTest = collatzLifespan(n);
        }
        return n;
	}
	static void printLifespanSequence(int input) {

		int counter = 1;
        while (counter <= input) {
            int lifespan = collatzLifespanSearch(counter);
            System.out.println(counter + ": " + lifespan);
            counter++;
        }
	}
	
	public static void startGeneralCalculator() { // start calculator
		System.out.println(
				"|-------------------------------|" + "\n" +
				"|-Welcome to General Calculator-|" + "\n" +
				"|-------------------------------|" + "\n" + "\n");
		System.out.println("Enter first number: ");
		Scanner fN = new Scanner(System.in);
		double firstNumber = fN.nextDouble();
		System.out.print(firstNumber);
		System.out.println("Enter Operation: 1 = +, 2 = -, 3 = *, 4 = /, 5 = ^x");
		Scanner oP = new Scanner(System.in);
		int operation = oP.nextInt();
		if (operation == 5) {
			Scanner power = new Scanner(System.in);
			System.out.println("Enter number for Power");
			int powerInput = power.nextInt();
			ifDeciderPower(firstNumber, powerInput);
		} else {
		System.out.println("Enter second number: ");
		Scanner sN = new Scanner(System.in);
		double secondNumber = sN.nextDouble();
		ifDeciderBasic(operation, firstNumber, secondNumber);
		}
	}
	public static void ifDeciderBasic(int operation, double firstNumber, double secondNumber) {
		if (operation == 1) { // addition
			double helper = firstNumber + secondNumber;
			System.out.println("Result: " + helper);
		} else if (operation == 2) { // subtraction
			double helper = firstNumber - secondNumber;
			System.out.println("Result: "+helper);
		} else if (operation == 3) { // multiplication
			double helper = firstNumber * secondNumber;
			System.out.println("Result: "+helper);
		} else if (operation == 4) { // division
			double helper = firstNumber / secondNumber;
			System.out.println("Result: "+ helper);
		} 
	}
	public static void ifDeciderPower(double firstNumber, double power) {
		double helper = Math.pow(firstNumber, power);
		System.out.println("Result: " + helper);
	}
	public static void startGuessingGame() {
		System.out.println(
				"|------------------------------|" + "\n" +
				"|-Welcome to The Guessing Game-|" + "\n" +
				"|------------------------------|" + "\n" + "\n");
		System.out.println("Pick a number betwee 1 and 100.");
		
		int startingGuess = 0;
		int guessingGuess = 50;
		int finalGuess = 0;
		guessingGameLoop(startingGuess, guessingGuess, finalGuess);
	}
	
	public static void guessingGameLoop(int startingGuess, int guessingGuess, int finalGuess) {
		int exitOperator = 0;
		int previous = 0;
		
		
		while (exitOperator != 3) {
			
			System.out.println("Is your number greater or lower than " + guessingGuess + "?");
			System.out.println("1 for higher, 2 for lower, 3 if I guessed it");
			Scanner input = new Scanner(System.in);
			int operator = input.nextInt();
			if (operator == 1) {
				previous = guessingGuess;
				guessingGuess = (guessingGuess + 100) / 2;
			} else if (operator == 2) {
				guessingGuess = (previous + guessingGuess) / 2;
				
			} else if (operator == 3) {
				exitOperator = operator;
			}
			System.out.println("Your number is: " + guessingGuess);
		}
	}
	public static boolean startPrimeTest(int input) {
		if (input < 2) {
			return false;
		}
		for (int counter = 2; counter < Math.sqrt(input); counter++) {
			if (input % counter == 0) {
				return false;
			}
		}
		return true;
	}
	
}