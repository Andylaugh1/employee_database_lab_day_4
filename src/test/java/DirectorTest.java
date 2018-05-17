import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "JS222665B", 2345.90, "Sales", 456363.09);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Sales", director.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.10);
        assertEquals(3346.00, director.salary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals( 23.46, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(456363.09, director.getBudget(), 0.01);
}

}
