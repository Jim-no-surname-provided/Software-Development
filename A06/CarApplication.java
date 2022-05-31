public class CarApplication {

    public static void main(String[] args) {
        Car[] cars = {
                buildCar("Frodo", 70, 18_078_620),
                buildCar("Renault R5", 130, 120_000),
                buildCar("Speedy Gonzáles", 40, 74_952_563),
                buildCar("Pi", 314, 159_265_358_979d),
                buildCar("Lightning McQueen", 780, 552000000000d),
                buildCar("Batmobil", 180, 148753),
        };

        Car aFasterCarThanLightningMcQueen = null;
        print(aFasterCarThanLightningMcQueen);
        
        for (Car car : cars) {
            print(car);
        }
        
        changeSpeed(cars[5], 50);
        drive(cars[5], 30);
        drive(cars[0], 15);
        changeSpeed(cars[2], 70);
        drive(cars[2], 180);
        changeSpeed(cars[1], 87.5);
        
        drive(aFasterCarThanLightningMcQueen, 180);
        changeSpeed(aFasterCarThanLightningMcQueen, 20);
        
    }

    static void changeSpeed(Car car, double delta) {
        if (car == null) {
            Out.println("changeSpeed: no car specified");
            return;
        }

        double newSpeed = car.speed + delta;
        if (newSpeed >= 0) {
            car.speed = newSpeed;
            Out.println(String.format("%s changed its speed to %s km/h", car.name, car.speed));
        } else {
            Out.println("changeSpeed: car cannot change its speed to a negative value");
        }
    }

    static void drive(Car car, int min) {
        if (car == null) {
            Out.println("drive: no car specified");
            return;
        }
        if (min < 0) {
            Out.println("drive: car cannot travel through time");
            return;
        }

        double distance = car.speed * min / 60.0;
        car.distance += distance;
        Out.println(String.format("%s drove %s km", car.name, distance));
    }

    static Car buildCar(String name, double speed, double distance) {
        Car car = new Car();
        car.name = name;
        car.speed = Math.abs(speed);
        car.distance = Math.abs(distance);
        return car;
    }

    static void print(Car car) {
        if (car == null) {
            Out.println("No car to print");
            return;
        }

        Out.println(String.format("\"%s\" is currently going %s km/h and has yet travelled %s km",
                car.name, car.speed, car.distance));
    }
}
