public class Processes{
	
	static int sum = 0;
	static int count = 0;
	static int minimum = Integer.MAX_VALUE;
	
	public static void main(String[] args){
		
		Out.println(String.format("Total: %s", total()));
		Out.println(String.format("Mean: %s", mean()));
		Out.println(String.format("Minimum: %s", minimum()));
		
		process(1);
		process(2);
		process(-17);
		process(42);
		process(-20);
		
		Out.println(String.format("Total: %s", total()));
		Out.println(String.format("Mean: %s", mean()));
		Out.println(String.format("Minimum: %s", minimum()));
		
		process(5);
		process(5);
		process(11);
		process(41);
		
		Out.println(String.format("Total: %s", total()));
		Out.println(String.format("Mean: %s", mean()));
		Out.println(String.format("Minimum: %s", minimum()));
		
		process(45);
		process(785);
		process(-101010);
		process(5);
		process(45632);
		
		Out.println(String.format("Total: %s", total()));
		Out.println(String.format("Mean: %s", mean()));
		Out.println(String.format("Minimum: %s", minimum()));
		
	}
	
	static void process(int i){
		sum += i;
		count++;
		if(i < minimum) minimum = i;
	}
	
	static int total(){
		return sum;
	}
	
	static double mean(){
		if(count == 0){
			Out.println("Error: No mean availabe since no number has been processed yet");
			return 0.0;
		}
		return sum / (double) count;
	}
	
	static int minimum(){
		if(count == 0){
			Out.println("Error: No minimum availabe since no number has been processed yet");
			return 0;
		}
		return minimum;
	}
	
}