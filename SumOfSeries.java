public class SumOfSeries{

	public static void main(String...args){
	
		long sum = 0;
		
		System.out.println("number \t Sum");
		
		for(int index = 1; index <= 100; index++){
		
			sum = sum + index;
			
			System.out.println(index + "\t" + sum);
		}
	}
}

//The difficulty ill face is the long sum would be long product = 1;
//instead of product = 0; because anything multiplying 0 would give 0 as an output.
