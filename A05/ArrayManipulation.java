import java.util.Arrays;

public class ArrayManipulation{ 
	
	static int testCount = 1;
	
	public static void main(String[] args)
	{
		performTest(
			new int[]{0, 0, 1},
			new int[]{5, 5, 5}
		);
		performTest(
			new int[]{10, 5, -1, 15},
			new int[]{6, 0, 1, 10, 15, 27, 13}
		);
		performTest(
			null,
			new int[]{5, 5, 5}
		);
		performTest(
			new int[]{Integer.MAX_VALUE, 10, 50},
			new int[]{5, 5, 5}
		);
	}
	
	static void add(int[] a, int[] b)
	{
		if(a == null || b == null)
			return;
		
		int minLength = Math.min(a.length, b.length);
		
		for (int i = 0; i < minLength; i++)
		{
			b[i] += a[i];
		}
	}
	
	static void performTest(int[] a, int[] b)
	{
		Out.println(String.format("Test %s:", testCount));
		testCount++;
		Out.println("Before add:");
		Out.println(String.format("a = %s", Arrays.toString(a)));
		Out.println(String.format("b = %s", Arrays.toString(b)));
		
		add(a, b);
		
		Out.println("After add:");
		Out.println(String.format("b = %s", Arrays.toString(b)));
		Out.println("-----------");
	}
	
}