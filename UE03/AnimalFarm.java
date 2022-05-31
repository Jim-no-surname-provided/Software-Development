public class AnimalFarm{
	public static void main(String[] args){
		Out.println("ANIMAL FEED 30000!");
		Out.println("Is your animal hungry? (y/n)");
		char isHungry = In.readChar();
		if(isHungry == 'y' || isHungry == 'Y'){
			Out.println("What do you want to feed: (1) Corn (2) Meat (3-9) Milk");
			int food = In.readInt();
			/*if(food == 1)
			{
				Out.println("The robot feeds corn.");
			} else if(food == 2){
				Out.println("The robot feeds meat.");
			} else if(food >= 3 && food <=9){
				Out.println("The robot feeds milk.");
			} else {
				Out.println("Sorry, we don't have that meal.");
			}*/

			switch(food){
				case 1:
					Out.println("The robot feeds corn.");
					break;
				case 2:
					Out.println("The robot feeds meat.");
					break;
				case 3: case 4: case 5: 
				case 6: case 7: case 8: case 9:
					Out.println("The robot feeds milk.");
					break;
				default:
					Out.println("Sorry, we don't have that meal.");
			}
			
		}
		Out.println("End feeding sequence.");
	}
}