public class StoryGenerator{
	public static void main(String[] args){
		
		Out.println("Ask a question: ");
		
		for(String question = In.readLine().toLowerCase(); !question.equals("x"); question = In.readLine().toLowerCase()){ // I had never made a for like this, but I liked it
			
			if(!question.endsWith("?")){
				Out.println("It is not a question");
			} else if(question.length() > 30){
				Out.println("Yes");
			} else if(question.indexOf(" is ") > 0 || question.indexOf(" are ") > 0){
				Out.println("No");
			} else if(question.startsWith("do ")  || question.startsWith("does ")){
				Out.println("Yes");
			} else {
				Out.println("No");
			}
			
			Out.println("");
		}
		
	}
}