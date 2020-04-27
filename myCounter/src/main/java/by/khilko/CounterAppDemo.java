package by.khilko;

import by.khilko.bean.Counter;
import by.khilko.service.CounterService;

import java.util.logging.Logger;

public class CounterAppDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setValue(11);
        System.out.println(counter.getValue());
        counter.setStep(0);
        System.out.println(counter.getStep());

    }
}
