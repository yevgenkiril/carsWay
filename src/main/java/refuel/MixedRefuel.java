package refuel;


import car.Car;

public class MixedRefuel extends Refuel {

    @Override
    public void visit(Car car) {
        fill(car);
    }
}
