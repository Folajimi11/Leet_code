import java.util.Scanner;

	public class Extreme{
	
		public static void main(String...args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int largest = number;
		int smallest = number;
		
		for(int index = 2; index <= 4; index++){
		
		System.out.println("Enter number: ");
		number = input.nextInt();
		
		if(number > largest){
		largest = number;
		}
		
		if(number < smallest){
		smallest = number;
		}
		}
		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is: " + smallest);
		}
	}
