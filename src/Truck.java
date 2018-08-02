public class Truck extends Car {

    private double loadWeight;


    public Truck(String brand, String model, double tankCap, double aveCombustion, boolean airConditioningOn, double loadWeight) {
        super(brand, model, tankCap, aveCombustion, airConditioningOn);
        this.loadWeight = loadWeight;
        if (loadWeight >= 0) {
            double result = loadWeight / 100 * 0.5;
            setAveCombustion(getAveCombustion() + result);
        }
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Ciężar ładunku(w kg): " + loadWeight);
    }

    @Override
    public boolean enableAirConditioning() {

        setAirConditioningOn(true);
        double newCombustion = getAveCombustion() + 1.6;
        setAveCombustion(newCombustion);
        return getAirConditioningOn();
    }

    @Override
    public boolean disableAirConditioning() {
        setAirConditioningOn(false);
        double newCombustion = getAveCombustion() - 1.6;
        setAveCombustion(newCombustion);
        return getAirConditioningOn();
    }


}
