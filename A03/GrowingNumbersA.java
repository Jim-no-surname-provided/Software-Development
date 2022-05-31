public class GrowingNumbersA{
	public static void main(String[] args){
		Out.println("--------");
		// With Do-While
		
		Out.println("Please enter a list of numbers, followed by an 'x':");
		int lastNum;
		int currentlyNum = Integer.MIN_VALUE;
		
		do{
			lastNum = currentlyNum;
			currentlyNum = In.readInt();
			
		}while(currentlyNum > lastNum && In.done());
		
		
		if(In.done()){ // It didn't stop because of a letter
			Out.println(String.format("Not strongly monotonically increasing, because %d <= %d", currentlyNum, lastNum));
		} else{ // It did stop because of a letter
			Out.println("Strongly monotonically increasing");
		}
		
	}
}