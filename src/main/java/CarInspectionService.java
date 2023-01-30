public class CarInspectionService {
    public boolean isNumberOfTiresValid(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean isSeatBeltInstalled(Car car) {
        return car.getSeatBelt();
    }

    public boolean isAirbagInstalled(Car car) {
        return car.getAirbag();
    }

    public boolean isNumberOfDoorsValid(Car car) {
        return car.getNumberOfDoors() == 3
                || car.getNumberOfDoors() == 5;
    }

    public boolean isValid(Car car) {
        return isNumberOfTiresValid(car)
                && isNumberOfDoorsValid(car)
                && isAirbagInstalled(car)
                && isSeatBeltInstalled(car)
                ;
    }
}
