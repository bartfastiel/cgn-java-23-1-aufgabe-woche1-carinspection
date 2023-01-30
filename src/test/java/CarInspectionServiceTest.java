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

    @Test
    void checkAirbagOfGoodCar() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car goodCar = new Car();
        goodCar.setAirbag(true);

        // WHEN
        boolean actual = service.isAirbagInstalled(goodCar);

        // THEN
        assertTrue(actual);
    }

    @Test
    void checkAirbagOfBadCar() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car badCar = new Car();
        badCar.setAirbag(false);

        // WHEN
        boolean actual = service.isAirbagInstalled(badCar);

        // THEN
        assertFalse(actual);
    }

    @Test
    void checkDoorsOfGoodCarWith3Doors() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car goodCar = new Car();
        goodCar.setNumberOfDoors(3);

        // WHEN
        boolean actual = service.isNumberOfDoorsValid(goodCar);

        // THEN
        assertTrue(actual);
    }
    @Test
    void checkDoorsOfGoodCarWith5Doors() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car goodCar = new Car();
        goodCar.setNumberOfDoors(5);

        // WHEN
        boolean actual = service.isNumberOfDoorsValid(goodCar);

        // THEN
        assertTrue(actual);
    }

    @Test
    void checkDoorsOfBadCarWith4Doors() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car badCar = new Car();
        badCar.setNumberOfDoors(4);

        // WHEN
        boolean actual = service.isNumberOfDoorsValid(badCar);

        // THEN
        assertFalse(actual);
    }

    @Test
    void checkDoorsOfBadCarWith2Doors() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car badCar = new Car();
        badCar.setNumberOfDoors(2);

        // WHEN
        boolean actual = service.isNumberOfDoorsValid(badCar);

        // THEN
        assertFalse(actual);
    }

    @Test
    void checkDoorsOfBadCarWith6Doors() {
        // GIVEN
        CarInspectionService service = new CarInspectionService();
        Car badCar = new Car();
        badCar.setNumberOfDoors(6);

        // WHEN
        boolean actual = service.isNumberOfDoorsValid(badCar);

        // THEN
        assertFalse(actual);
    }


}
