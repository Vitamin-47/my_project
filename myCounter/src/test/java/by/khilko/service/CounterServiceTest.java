package by.khilko.service;

import by.khilko.bean.Counter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterServiceTest {

    @Test
    void increment() {
        Counter counter = new Counter(25,5);
        CounterService service = new CounterService();

        int expected = 30;
        int actual = service.increment(counter);

        assertEquals(expected, actual, "Should right increment");
    }

    @Test
    void decrement() {
        Counter counter = new Counter(10,2);
        CounterService service = new CounterService();

        int expected = 8;
        int actual = service.decrement(counter);

        assertEquals(expected, actual, "Should right decrement");
    }

    @Test
    void reset() {
        Counter counter = new Counter(50,8);
        CounterService service = new CounterService();

        int expected = 0;
        int actual = service.reset(counter);

        assertEquals(expected, actual, "Should right ZERO");
    }
}