package place;


import car.Car;
import exceptions.NotEnoughFuelException;

public class Road extends Place{
    private int length;

    public Road(int length) {
        this.length = length;
    }

    @Override
    public void visit(Car car) throws NotEnoughFuelException {
        if (car.getCurrentCapacity() < length) {
            throw new NotEnoughFuelException();
        }

        car.setCurrentCapacity(car.getCurrentCapacity() - this.length);
        System.out.println("Car " + car.getClass() + " visited road with length " + length + " and capacity = " + car.getCurrentCapacity());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}
