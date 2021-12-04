import com.company.*;
import org.junit.Assert;
import org.junit.Test;

public class AppointmentTest {
    Patient patient = new Patient(1, "Stefan", "Ivanov", 85);
    Patient patient2 = new Patient(2, "Steven", "Ivanov", 45);
    Doctor doctor = new Doctor(1, "Ivo", "Petrov", HospitalSpecialties.ANESTHESIOLOGY);
    Appointment appointment = new Appointment(1, patient, TypeOfExaminations.INITIAL, "25-05-2021", "1400", doctor);
    Appointment appointment2 = new Appointment(2, patient2, TypeOfExaminations.INITIAL, "28-05-2021", "1400", doctor);

    @Test
    public void testToString2() {

        String expected = "1,1,INITIAL,25-05-2021,1400,1";
        String actual = appointment.toString2();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareByNamePatient() {
        int expected = -1;
        int actual = appointment2.compareTo(appointment);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToPatientIdDescending() {
        int expected = 1;
        int actual = appointment2.compareToPatientIdDescending(appointment);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToDateDescending() {
        int expected = 3;
        int actual = Appointment.compareToDateDescending(appointment, appointment2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareByNamePatientDescending() {
        int expected = 0;
        int actual = Appointment.compareByNamePatientDescending(appointment, appointment2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToDate() {
        int expected = -3;
        int actual = Appointment.compareToDate(appointment, appointment2);
        Assert.assertEquals(expected, actual);
    }
}
