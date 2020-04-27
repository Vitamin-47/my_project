package by.khilko.service;

import by.khilko.bean.Counter;

public class CounterService {

    public int increment(Counter counter) {
        if ((counter.getValue() + counter.getStep()) > 100) {
            System.out.println("Incorrect value");
        }
        if ((counter.getValue() + counter.getStep()) < 100) {
            int ch = counter.getValue() + counter.getStep();
            counter.setValue(ch);
        }
        System.out.println(counter.getValue());
        return counter.getValue();
    }

    public int decrement(Counter counter) {
        if ((counter.getValue() - counter.getStep()) < 0) {
            System.out.println("Incorrect value");
        }
        if ((counter.getValue() - counter.getStep()) > 0) {
            int ch = counter.getValue() - counter.getStep();
            counter.setValue(ch);
        }
        System.out.println(counter.getValue());
        return counter.getValue();
    }

    public int reset(Counter counter) {
        counter.setValue(0);
        System.out.println(counter.getValue());
        return counter.getValue();
    }



}
