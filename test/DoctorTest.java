import com.company.Doctor;
import com.company.HospitalSpecialties;
import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {
    @Test
    public void testToString() {
        Doctor doctor = new Doctor(1, "Ivaylo", "Vladimirov", HospitalSpecialties.ANESTHESIOLOGY);
        String expected ="Doctor{speciality=ANESTHESIOLOGY, id=1, firstName='Ivaylo', secondName='Vladimirov'}";
        String actual = doctor.toString();
        Assert.assertEquals("Correct print to String on Doctor doctor", expected, actual);
    }
}
