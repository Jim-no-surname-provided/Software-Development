class NumberReader {

  public static void main(String[] args) {
	In.open("Numbers.txt");
	if(!In.done()){
		Out.println("File does not exist");
		System.exit(1);  // 0 means success, other means error
	}
	
	int sum = 0;
	
	int number = In.readInt(); // If the file doesn't exist, it read nothing and In.done() is false
	
	while (In.done()){  // In.done says if it has successfull read;
		
		sum += number;
		Out.println(
			String.format(
				"%d read, added to sum, new sum: %d",
				number,
				sum
			)
		);
		
		number = In.readInt();
	}
	
		In.close();
  }
}
