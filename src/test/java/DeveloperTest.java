import staff.techStaff.Developer;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sandy", "JK164672A", 10000.88);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.10);
        assertEquals(11000.98, developer.salary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals( 100.01, developer.payBonus(), 0.01);
    }

}
