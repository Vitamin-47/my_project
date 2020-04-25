package by.khilko.service;

import by.khilko.bean.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void myInfoCar() {
        Car car = new Car("AUDI", "White",1999);
        CarService service = new CarService();

        String expected = "AUDI";
        String actual = service.myInfoCar(car);

        assertEquals(expected, actual, "OK");
    }
}