import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DoctorTest {
    ArrayList<User> doctors = ReadFile.readDoctorsFromCSV("doctors");

    @Test
    public void testGroupByNameDoctorsWhenReadFileFromCsvNoObject() {
        Assert.assertNotNull("No Object when read csv file appointments", doctors);
    }

    @Test
    public void testSize() {
        Assert.assertEquals("Checking size of ArrayList", 10, doctors.size());
    }

    @Test
    public void testToString() {
        Doctor doctor = new Doctor(1, "Ivaylo", "Vladimirov", HospitalSpecialties.ANESTHESIOLOGY);
        String expected = "Doctor{speciality=ANESTHESIOLOGY, id=1, firstName='Ivaylo', secondName='Vladimirov'}";
        String actual = doctor.toString();
        Assert.assertEquals("Correct print to String on Doctor doctor", expected, actual);
    }
}
