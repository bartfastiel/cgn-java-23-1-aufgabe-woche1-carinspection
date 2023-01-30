import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void x() {
        Car car = new Car();
        car.setNumberOfTires(4);
        int actual = car.getNumberOfTires();
        assertEquals(4, actual);
    }
}
