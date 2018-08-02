public class Vehicle {

    private String brand;
    private String model;
    private double tankCap;
    private double aveCombustion;

    public Vehicle(String brand, String model, double tankCap, double aveCombustion) {
        this.brand = brand;
        this.model = model;
        this.tankCap = tankCap;
        this.aveCombustion = aveCombustion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTankCap() {
        return tankCap;
    }

    public void setTankCap(double tankCap) {
        this.tankCap = tankCap;
    }

    public double getAveCombustion() {
        return aveCombustion;
    }

    public void setAveCombustion(double aveCombustion) {
        this.aveCombustion = aveCombustion;
    }

    public void show() {
        System.out.println();
        System.out.println("Marka: " + brand);
        System.out.println("Model:  " + model);
        System.out.println("Pojemność baku: " + tankCap);
        System.out.println("średnie spalanie na 100 km: " + aveCombustion);
    }

    public double range() {

        return getTankCap() / getAveCombustion() * 100;
    }


}
