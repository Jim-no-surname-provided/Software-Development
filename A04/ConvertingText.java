public class ConvertingText{
	public static void main(String[] args){
		
		Out.println("Please enter a sentence:");
		String myString = In.readLine();

		StringBuilder myStringBuilder = new StringBuilder();
		
		boolean lastWasSpace = true;
		for(char ch : myString.toCharArray()){
			
			if(Character.isDigit(ch)){
				for(int i = 1; i <= ch - '0'; i++){
					myStringBuilder.append('x');
				}
				lastWasSpace = false;
				
			} else if (Character.isLetter(ch)){
				if(lastWasSpace){
					myStringBuilder.append(Character.toUpperCase(ch));
					lastWasSpace = false;
				} else {
					myStringBuilder.append(Character.toLowerCase(ch));
				}
				
			} else if (ch == ' '){
				myStringBuilder.append("   ");
				lastWasSpace = true;
			}
		}
		
		Out.println(myStringBuilder);
	}
}