import car.Car;
import car.ElectroCar;
import car.GasCar;
import place.Finish;
import place.Road;
import refuel.GasRefuel;
import refuel.MixedRefuel;
import way.Way;

public class Main {

    public static void main(String[] args) {
        Car electro = new ElectroCar();
        Car gas = new GasCar();

        Car[] cars = new Car[2];
        cars[0] = electro;
        cars[1] = gas;

        Way way = new Way();
        way.add(new Road(400));
        way.add(new MixedRefuel());
        way.add(new Road(50));
        way.add(new GasRefuel());

        way.add(new Finish());

        way.ride(cars);

    }
}
