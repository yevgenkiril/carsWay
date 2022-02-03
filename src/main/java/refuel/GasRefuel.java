package refuel;


import car.Car;
import car.GasCar;
import exceptions.NotMyRefuelException;

public class GasRefuel extends Refuel{

    @Override
    public void visit(Car car) throws NotMyRefuelException {
        if (!(car instanceof GasCar)) {
            throw new NotMyRefuelException();
        }

        fill(car);
    }

}
