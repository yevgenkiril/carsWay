package refuel;


import car.Car;
import place.Place;

public abstract class Refuel extends Place implements FillUp {

    @Override
    public void fill(Car car) {
        car.setCurrentCapacity(car.getMaxCapacity());
        car.setRefuelCount(car.getRefuelCount() + 1);
        System.out.println(car.getClass().getName() + " был заправлен" );
    }

}
