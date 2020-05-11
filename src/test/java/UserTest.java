import ie.gmit.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void getUserTest() {
        Student Mike = new Student("Michael Healy", "22/06/1985", 31);

        String Expected = "michaelhealy31";
        String Actual = Mike.getUsername();
        assertEquals(Expected, Actual);

    }
}
