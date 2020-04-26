package by.khilko.service;

import by.khilko.bean.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServiceTest {

    @Test
    void outMyName() {
        Name name = new Name("Vitaliy", 34);
        NameService service = new NameService();

        String expected = "Vitaliy";
        String actual = service.outMyName(name);

        assertEquals(expected, actual, "RESULT name = VItaliy");
    }
}