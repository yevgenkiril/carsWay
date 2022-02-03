package car;

public class GasCar extends Car {

    public GasCar(){
        this.setCurrentCapacity(this.getMaxCapacity());
    }

    @Override
    public int getMaxCapacity() {
        return 500;
    }
}
