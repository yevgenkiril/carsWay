package car;

public class ElectroCar extends Car{

    public ElectroCar(){
        this.setCurrentCapacity(this.getMaxCapacity());
    }

    @Override
    public int getMaxCapacity() {
        return 300;
    }
}
