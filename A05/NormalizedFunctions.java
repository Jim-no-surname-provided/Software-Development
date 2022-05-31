import java.util.Arrays;

public class NormalizedFunctions{
	
	static int testCount = 1;
	
	public static void main(String[] args){
		
		test(0, 10, 5);
		test(0, 10, 0, 5, 10);
		test(-45.7, 75, 1005, 17, 12654, 0, 0.2555);
		test(-45.88, 75.3, 14.01, 17, -12.2, -0.2555);
		
	}
	
	static void test(double min, double max, double... values){
		
		Out.println(String.format("Test %d:", testCount));
		Out.println(String.format("min = %s, max = %s", min, max));
		
		
		if(values.length > 1){
			Out.println(String.format("Values = %s", Arrays.toString(values)));
			Out.println(String.format("Result = %s", Arrays.toString(normalized(min, max, values))));	
		} else {
			Out.println(String.format("Value = %s", values[0]));
			Out.println(String.format("Result = %s", normalized(min, max, values[0])));
		}
		
		
		Out.println("--------------");
		testCount++;
	}
	
	static double normalized(double min, double max, double value){
		if(value >= max){
			return 1;
		}
		if(value <= min){
			return 0;
		}
		return (value - min)/(max - min);
	}
	
	static double[] normalized(double min, double max, double... values){
		double[] result = new double[values.length];
		
		for(int i = 0; i < values.length; i++){
			result[i] = normalized(min, max, values[i]);
		}
		return result;
		
	}
}