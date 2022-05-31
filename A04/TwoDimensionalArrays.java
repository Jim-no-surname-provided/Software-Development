public class TwoDimensionalArrays{
	public static void main(String[] args){
		In.open("numbers.txt");
		int rowsAmount = In.readInt();
		int columnsAmount = In.readInt();
		
		int[][] numbers = new int[rowsAmount][columnsAmount];
		
		
		// Read Numbers
		for(int row = 0; row < rowsAmount; row++){
			for(int column = 0; column < columnsAmount ; column++){
				numbers[row][column] = In.readInt();
			}
		}
		
		// Search Greatest Sum
		int maxSum = 0;
		int rowWithMaxSum = 0;
		int columnWithMaxSum = 0;
		
		for(int row = 0; row < rowsAmount - 1; row++){  // All columns except for one
			for(int column = 0; column < columnsAmount - 1; column++){  // All rows except for one
			
				int sum = numbers[row][column]		+ numbers[row][column + 1] +
						  numbers[row + 1][column]  + numbers[row + 1][column + 1];
						
				if(sum > maxSum){
					maxSum = sum;
					rowWithMaxSum = row;
					columnWithMaxSum = column;
				}
			}
		}
		
		
		Out.println(String.format("Max found at [%d, %d]: %d",rowWithMaxSum, columnWithMaxSum, maxSum));
		
		
	}
}