import java.util.Scanner;
public class SearchAndSort {
	
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// bubble, selection, insertion, merge, linear, binary, quit 
		System.out.println("Options: bubble, selection, insertion, merge, linear, binary, quit ");
		System.out.println();
		System.out.println("What algorithm would you like to execute?");
		Scanner in = new Scanner(System.in);
		String pickOne = in.nextLine();
		System.out.println();

		
		
		// integers, strings
		System.out.println("Options: integers, strings");
		System.out.println();
		System.out.println("What type of data?");
		Scanner in1 = new Scanner(System.in);
		String pickTwo = in1.nextLine();
		System.out.println();
		
		//array, list
		System.out.println("How is it stored?");
		Scanner in11 = new Scanner(System.in);
		String sortStored = in11.nextLine();
		System.out.println();
		
		
		System.out.println("Enter the data?");
		Scanner in111 = new Scanner(System.in);
		String enteredData = in111.nextLine();
		System.out.println();
		
		// Scanner input = new Scanner(System.in);
	    double[] numbers = new double[5];

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextDouble();
	    }
		
	switch (pickOne) {
		case "bubble":
			String bubble = pickOne;
			break;
			
		case "selection":
			String selection = pickOne;
			break;
		
		case "insertion":
			String insertion = pickOne;
			break;
		
		
		case "merge":
			String merge = pickOne;
			break;
		
		
		case "linear":
			String linear = pickOne;
			break;
		
		case "binary":
			String binary = pickOne;
			break;
		
		default:
			return;
	}
		
		
	switch (pickTwo) {
		case "integers":
				String integers = pickTwo;
				break;
			
		case "strings":
			String strings = pickTwo;
			break;
			
		default:
			return;
	}
	}	
		
		
		
	
	
	
	
		
		// integers, strings
		
		
		//System.out.println(sortType + " " +"sort");
		
	
	public void bubble (String bubble) {
		int y = 0;
	//	for (int y = 0; y < )
	}
	
}