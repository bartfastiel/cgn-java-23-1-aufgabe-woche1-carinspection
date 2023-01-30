public class CarInspectionService {
    public boolean isNumberOfTiresValid(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean isSeatBeltInstalled(Car car) {
        return car.getSeatBelt();
    }
}