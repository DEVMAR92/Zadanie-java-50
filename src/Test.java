public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        Truck[] trucks = new Truck[3];

        cars[0] = new Car("Audi", "A4", 80, 8, false);
        cars[1] = new Car("VW", "Polo", 45, 5.5, false);
        cars[2] = new Car("Skoda", "Octavia", 80, 6.7, false);

        trucks[0] = new Truck("Scania", "R420", 700, 28, false, 1500);
        trucks[1] = new Truck("Daf", "XF 105", 1000, 30, false, 5000);
        trucks[2] = new Truck("Iveco", "Stralis", 450, 25, false, 500);

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
            System.out.println("Zasięg: " + cars[i].range());
            cars[i].enableAirConditioning();
            cars[i].show();
            System.out.println("Zasięg: " + cars[i].range());

        }


        for (int i = 0; i < trucks.length; i++) {
            trucks[i].show();
            System.out.println("Zasięg: " + trucks[i].range());
            trucks[i].enableAirConditioning();
            trucks[i].show();
            System.out.println("Zasięg: " + trucks[i].range());

        }


    }
}
