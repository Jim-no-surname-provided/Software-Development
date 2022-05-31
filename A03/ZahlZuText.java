public class ZahlZuText{
	public static void main(String[] args){
		
		Out.println("Please enter a number:");
		int number = In.readInt();
		
		// int number = (int) (Math.random() * 999);// Just to test
		// Out.println(number);						// Just to test
		
		if(number >= 1000 || number < 100){
			Out.println("Sorry, invalid number");
			System.exit(1);
		}
		
		int digit1 = number / 100;
		String digit1S = "";
		
		switch(digit1){
			case 1:
			digit1S = "Ein";
			break;
			case 2:
			digit1S = "Zwei";
			break;
			case 3:
			digit1S = "Drei";
			break;
			case 4:
			digit1S = "Vier";
			break;
			case 5:
			digit1S = "Fünf";
			break;
			case 6:
			digit1S = "Sechs";
			break;
			case 7:
			digit1S = "Sieben";
			break;
			case 8:
			digit1S = "Acht";
			break;
			case 9:
			digit1S = "Neun";
			break;
		}
		digit1S += "hundert";
		
		int digit2 = (number / 10) % 10;
		String digit2S = "";
				
		switch(digit2){
			case 0:
			digit2S = "";
			break;
			case 1:
			digit2S = "Zehn";
			break;
			case 2:
			digit2S = "Zwanzig";
			break;
			case 3:
			digit2S = "Dreißig";
			break;
			case 4:
			digit2S = "Vierzig";
			break;
			case 5:
			digit2S = "Fünfzig";
			break;
			case 6:
			digit2S = "Sechzig";
			break;
			case 7:
			digit2S = "Siebzig";
			break;
			case 8:
			digit2S = "Achtzig";
			break;
			case 9:
			digit2S = "Neunzig";
			break;
		}
		
		int digit3 = number % 10;
		String digit3S = "";
		
		switch(digit3){
			case 0:
			digit3S = "";
			break;
			case 1:
			digit3S = "Eins";
			break;
			case 2:
			digit3S = "Zwei";
			break;
			case 3:
			digit3S = "Drei";
			break;
			case 4:
			digit3S = "Vier";
			break;
			case 5:
			digit3S = "Fünf";
			break;
			case 6:
			digit3S = "Sechs";
			break;
			case 7:
			digit3S = "Sieben";
			break;
			case 8:
			digit3S = "Acht";
			break;
			case 9:
			digit3S = "Neun	";
			break;
		}
		
		Out.println(digit1S + digit2S + digit3S); 
		
		
		
	}
}