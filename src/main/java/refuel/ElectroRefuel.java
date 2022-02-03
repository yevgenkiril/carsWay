package refuel;


import car.Car;
import car.ElectroCar;
import exceptions.NotMyRefuelException;

public class ElectroRefuel extends Refuel{

    @Override
    public void visit(Car car) throws NotMyRefuelException {
        if (!(car instanceof ElectroCar)) {
            throw new NotMyRefuelException();
        }

        fill(car);
    }

}
