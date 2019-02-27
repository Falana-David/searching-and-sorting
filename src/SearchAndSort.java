import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class SearchAndSort {
	
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	public String Stringer;
	public String myStringArray;
	public String pickOne;
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
		System.out.println("Options: array, list");
		System.out.println();
		System.out.println("How is it stored?");
		Scanner in11 = new Scanner(System.in);
		String pickThree = in11.nextLine();
		System.out.println();
		
		
		System.out.println("Enter the data?");
		Scanner in111 = new Scanner(System.in);
		String pickFour = in111.nextLine();
		System.out.println();
		
		if (pickThree.contentEquals("lists"));
		{
			ArrayList Stringer = new ArrayList();
			Stringer.add(pickFour);
		}
		
		if (pickThree.contains("array"));
		{
			String[] myStringArray;
			myStringArray = new String[]{pickFour};
		}
		
		//ArrayList al = new ArrayList();
		
		// Scanner input = new Scanner(System.in);
	 //   double[] numbers = new double[5];

		/*
		 * for (int i = 0; i < numbers.length; i++) {
		 * System.out.println("Please enter number"); numbers[i] = input.nextDouble(); }
		 */
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
	
	
	switch (pickThree) {
	case "array":
			String array = pickThree;
			break;
		
	case "list":
		String list = pickThree;
		break;
		
	default:
		return;
}
	}	
		
		// integers, strings
		//System.out.println(sortType + " " +"sort");
	
	
	 //StringTokenizer stringTokenizer = 
			  //  new StringTokenizer(commaSeperatedString , ",");
	
	
	
	public void bubble (String bubble) {
		if (pickOne.contentEquals(bubble));
		{		System.out.print(Stringer);
		}
	}
	
}