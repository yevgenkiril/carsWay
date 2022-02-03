package way;


import car.Car;
import exceptions.NotEnoughFuelException;
import exceptions.NotMyRefuelException;
import place.Place;

import java.util.ArrayList;

public class Way extends ArrayList<Place> {

    @Override
    public boolean add(Place place) {
/*        System.out.println(size());
        for (int i = size(); i >= 0; i--) {
            this.get(i) instanceof Refuel
        }*/

        return super.add(place);
    }

    public void ride(Car[] cars) {
        int carsSize = cars.length;

        for (Place place : this) {
            for (int i = 0; i < carsSize; i++) {
                try {
                    Car car = cars[i];
                    if (car.isCanRide()){
                        place.visit(car);
                    }else {
                        System.out.println(car.getClass() + " cannot ride because loh");
                    }
                } catch (NotEnoughFuelException e) {
                    System.out.println(e.getMessage());
                    cars[i].setCanRide(false);
                } catch (NotMyRefuelException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}
