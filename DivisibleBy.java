public class DivisibleBy{

	public static void main(String...args){
	
	int count = 0;
	
	for(int index = 1; index <= 30; index++){
	
		if(index % 3 == 0){
		
			count = count + index;
		
			System.out.println(count);
			
		}
	}
	}
}
