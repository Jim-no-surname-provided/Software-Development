public class Loops {
	public static void main(String[] args){
		for(int i = 1; i <= 4; i++){
			// The ! are exactly i
			for(int j = 1; j <= i ; j++)
			{
				Out.print("!");
			}
			// The ? are exactly two times i
			for(int k = 1; k <= i ; k++)
			{
				Out.print("??"); // We could run the loop the double times of i, but we don't need to
			}
			Out.println();
		}
	}
	
}