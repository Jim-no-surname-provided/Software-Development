public class VehicleNeeded{
	public static void main(String[] args){
		
		// Read Boxes↓ (Int)
		Out.println("Hello, how many boxes do you want to move?");
		int nBoxes = In.readInt();
		
		// Is it negative ("invalid")?
		if(nBoxes < 0){
			Out.println("Sorry, invalid amount of boxes");
			System.exit(1);
		}
		
		// max 6 -> Car
		if(nBoxes <= 6){
			Out.println("You just need a car");
		
		// 6 - 20 -> Microtransporter
		} else /*nBoxes > 6*/ if(nBoxes < 20){	
			Out.println("You need a Microtransporter");
			
		// min 20 -> ask total weight↓ (float)
		} else {
			Out.println("How heavy are the boxes in total (kilograms)?");
			float weight = In.readFloat();
			
			if(weight < 0){
				Out.println("Sorry, invalid weight of boxes");

			} else /* weight >= 0 */ if (weight < 1_000){
				Out.println("You need a Transporter");
				
			} else /* weight >= 1_000 */ if (weight < 10_000){
				Out.println("You need a Truck");
				
			} else {
				Out.println("You need a Jumbojet");
			}
			
		}
	}
}