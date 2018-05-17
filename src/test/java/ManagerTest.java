package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "JS222665B", 2345.90, "Sales");
    }

    @Test
    public void canGetDepartmentName() {
      assertEquals("Sales", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.10);
        assertEquals(3346.00, manager.salary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals( 23.46, manager.payBonus(), 0.01);
    }
}
