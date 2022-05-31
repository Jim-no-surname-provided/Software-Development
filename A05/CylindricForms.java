public class CylindricForms{
	public static void main(String[] args){
		Out.println("----------------------------------------------");
		Out.println("What do you want to calculate?");
		Out.println("Choose:");
		Out.println("[0] for the area of a circle");
		Out.println("[1] for the volume of a cylinder");
		Out.println("[2] for the volume of a cylindric Pyramid");
		
		int choice = In.readInt();
		
		double radius = 0.0;
		double height = 0.0;
		
		switch (choice){
			case 0:
				Out.println("Please enter the radius of your circle");
				Out.print("Radius = ");
				radius = In.readDouble();
				
				Out.println(String.format("The area is %s", circleArea(radius)));
			break;
			case 1:
				Out.println("Please enter the radius and height of your cylinder");
				Out.print("Radius = ");
				radius = In.readDouble();
				Out.print("Height = ");
				height = In.readDouble();
				
				Out.println(String.format("The volume is %s", cylinderVol(radius, height)));
			break;
			case 2:
				Out.println("Please enter the radius and height of your cylindric pyramid");
				Out.print("Radius = ");
				radius = In.readDouble();
				Out.print("Height = ");
				height = In.readDouble();
				
				Out.println(String.format("The volume is %s", cylinderPyramidVol(radius, height)));
				
			break;
			default:
			Out.println("Sorry, invalid choice.");
		}
		
		Out.println("----------------------------------------------");
	}
	
	static double circleArea(double radius){
		if (radius <= 0) return 0;
		
		return Math.PI * radius * radius;
	}
	
	static double cylinderVol(double radius, double height){
		if (height <= 0) return 0;
		
		return circleArea(radius) * height;
	}
	
	static double cylinderPyramidVol(double radius, double height){
		return cylinderVol(radius, height) / 3 ;
	}
	
	
	
	
}