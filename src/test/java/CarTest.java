import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void whenTwoCarsHaveSamePropertys_expectEqualsTrue() {
        Car a = new Car();
        a.setAirbag(true);
        a.setSeatBelt(false);
        a.setNumberOfDoors(5);
        a.setNumberOfTires(4);

        Car b = new Car();
        b.setAirbag(true);
        b.setSeatBelt(false);
        b.setNumberOfDoors(5);
        b.setNumberOfTires(4);

        assertTrue(a.equals(b));
    }

    @Test
    void whenTwoCarsHaveDifferentPropertys_expectEqualsFalse() {
        Car a = new Car();
        a.setAirbag(true);
        a.setSeatBelt(false);
        a.setNumberOfDoors(5);
        a.setNumberOfTires(4);

        Car b = new Car();
        b.setAirbag(false);
        b.setSeatBelt(false);
        b.setNumberOfDoors(5);
        b.setNumberOfTires(4);

        assertFalse(a.equals(b));
    }

    @Test
    void checkToString() {
        // GIVEN
        Car car = new Car();
        car.setAirbag(true);
        car.setSeatBelt(false);
        car.setNumberOfDoors(5);
        car.setNumberOfTires(4);

        // WHEN
        String actual = car.toString();

        // THEN
        assertEquals("Car{numberOfTires=4, numberOfDoors=5, seatBelt=false, airbag=true}", actual);
    }

    @Test
    void checkConstructor() {
        // GIVEN
        Car car = new Car(4, 5, false, true);

        // WHEN
        String actual = car.toString();

        // THEN
        assertEquals("Car{numberOfTires=4, numberOfDoors=5, seatBelt=false, airbag=true}", actual);
    }
}
