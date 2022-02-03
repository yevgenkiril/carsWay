package car;

public abstract class Car {
    private int maxCapacity;
    private int currentCapacity;
    private String name;
    private int refuelCount;
    private boolean canRide = true;

    public abstract int getMaxCapacity();

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRefuelCount() {
        return refuelCount;
    }

    public void setRefuelCount(int refuelCount) {
        this.refuelCount = refuelCount;
    }

    public boolean isCanRide() {
        return canRide;
    }

    public void setCanRide(boolean canRide) {
        this.canRide = canRide;
    }
}
