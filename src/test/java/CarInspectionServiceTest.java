import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarInspectionServiceTest {
    @Test
    void checkTiresOfGoodCar() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car goodCar = new Car();
        goodCar.setNumberOfTires(4);

        // WHEN
        boolean actual = service.isNumberOfTiresValid(goodCar);

        // THEN
        assertTrue(actual);
    }

    @Test
    void checkTiresOfBadCar() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car badCar = new Car();
        badCar.setNumberOfTires(5);

        // WHEN
        boolean actual = service.isNumberOfTiresValid(badCar);

        // THEN
        assertFalse(actual);
    }

    @Test
    void checkSeatBeltOfGoodCar() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car goodCar = new Car();
        goodCar.setSeatBelt(true);

        // WHEN
        boolean actual = service.isSeatBeltInstalled(goodCar);

        // THEN
        assertTrue(actual);
    }

    @Test
    void checkSeatBeltOfBadCar() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car badCar = new Car();
        badCar.setSeatBelt(false);

        // WHEN
        boolean actual = service.isSeatBeltInstalled(badCar);

        // THEN
        assertFalse(actual);
    }

}