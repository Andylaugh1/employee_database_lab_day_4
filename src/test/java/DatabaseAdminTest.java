

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Emily", "JK987654A", 13000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(800.20);
        assertEquals(13800.20, databaseAdmin.salary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(130.00, databaseAdmin.payBonus(), 0.01);
    }
}