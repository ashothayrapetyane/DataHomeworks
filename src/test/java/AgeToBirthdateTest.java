import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AgeToBirthdateTest {

    @Test
    public void getDate() {
        AgeToBirthdate poxos = new AgeToBirthdate(35);
        assertEquals(poxos.getDate(), LocalDate.now().minusYears(35).getYear());
    }

    @Test
    public void getAge() {
        AgeToBirthdate poxos = new AgeToBirthdate(35);
        assertEquals(poxos.getAge(),35);
    }
}