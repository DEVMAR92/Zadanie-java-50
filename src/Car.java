public class Car extends Vehicle {

    private boolean airConditioningOn;

    public Car(String brand, String model, double tankCap, double aveCombustion, boolean airConditioningOn) {
        super(brand, model, tankCap, aveCombustion);
        this.airConditioningOn = airConditioningOn;
    }


    public boolean getAirConditioningOn() {
        return airConditioningOn;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        this.airConditioningOn = airConditioningOn;
    }

    public boolean enableAirConditioning() {
        airConditioningOn = true;
        double newCombustion = getAveCombustion() + 0.8;
        setAveCombustion(newCombustion);
        return airConditioningOn;
    }

    public boolean disableAirConditioning() {
        airConditioningOn = false;
        double newCombustion = getAveCombustion() - 0.8;
        setAveCombustion(newCombustion);
        return airConditioningOn;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Klimatyzacja włącznona: " + airConditioningOn);
    }
}
