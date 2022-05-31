public class MultiplicationsTable{
	public static void main(String[] args){
		Out.println("From:");
		int from = In.readInt();
		
		Out.println("To:");
		int to = In.readInt();
		
		Out.println("Times:");
		int times = In.readInt();
		
		for(int i = 1; i <= times; i++){
			Out.print(String.format("x%-3d|", i));
			for(int j = from; j <= to; j++){
				Out.print(String.format("%5d", j*i));
			}
			Out.println();
		}
			
			
	}
}