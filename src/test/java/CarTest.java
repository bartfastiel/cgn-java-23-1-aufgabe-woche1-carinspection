import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void checkProperty_numberOfTires() {
        Car car = new Car();
        car.setNumberOfTires(4);
        int actual = car.getNumberOfTires();
        assertEquals(4, actual);
    }

    @Test
    void checkProperty_numberOfDoors() {
        Car car = new Car();
        car.setNumberOfDoors(5);
        int actual = car.getNumberOfDoors();
        assertEquals(5, actual);
    }

    @Test
    void checkProperty_seatBelt() {
        Car car = new Car();
        car.setSeatBelt(true);
        boolean actual = car.getSeatBelt();
        assertEquals(true, actual);
    }

    @Test
    void checkProperty_airbag() {
        Car car = new Car();
        car.setAirbag(true);
        boolean actual = car.getAirbag();
        assertEquals(true, actual);
    }
}
