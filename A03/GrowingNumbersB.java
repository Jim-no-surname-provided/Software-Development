public class GrowingNumbersB{
	public static void main(String[] args){
		Out.println("--------");
		// With Do-While
		
		Out.println("Please enter a list of numbers, followed by an 'x':");
		int lastNum  = Integer.MIN_VALUE;
		int currentlyNum = In.readInt();
		
		while(currentlyNum > lastNum && In.done()){
			lastNum = currentlyNum;
			currentlyNum = In.readInt();
			
		}
		
		
		if(In.done()){ // It didn't stop because of a letter
			Out.println(String.format("Not strongly monotonically increasing, because %d <= %d", currentlyNum, lastNum));
		} else{ // It did stop because of a letter
			Out.println("Strongly monotonically increasing");
		}
		
	}
}