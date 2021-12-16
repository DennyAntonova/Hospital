import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static com.company.ReadFile.readAppointmentsFromCSV;

public class PatientTest {
    Patient patient = new Patient(1, "Stefan", "Ivanov", 85);
    Doctor doctor = new Doctor(1, "Ivo", "Petrov", HospitalSpecialties.ANESTHESIOLOGY);
    ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");


//    @Test
//    public void testReversedHours() throws IOException {
//        for (int i = 0; i < appointments.size(); i++) {
//            String expected = String.valueOf(appointments);
//            String actual = Patient.reversedHours(appointments, "1");
//            String msg = "";
//            Assert.assertEquals(expected, actual);
//
//        }
//    }

    @Test
    public void testToString() {
        Patient p = new Patient(1, "Denitsa", "Stefanova", 25);
        String expected = "Patient{age=25, id=1, firstName='Denitsa', secondName='Stefanova'}";
        String actual = p.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeDateMethod() throws IOException {
        int appointmentId = 1;
        String newDate = "25-06-1026";
        String expected = "false";
        String actual = String.valueOf(Objects.equals(appointments.get(appointmentId - 1).setDate(newDate), appointmentId));
        Assert.assertEquals(expected, actual);
    }

}