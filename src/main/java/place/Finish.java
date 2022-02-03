package place;


import car.Car;

public class Finish extends Place{
    @Override
    public void visit(Car car) throws Exception {
        System.out.println(car.getClass() + " finished with refuel count " + car.getRefuelCount());
    }
}
