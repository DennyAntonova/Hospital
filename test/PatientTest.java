import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static com.company.ReadFile.readAppointmentsFromCSV;

public class PatientTest {
    Patient patient = new Patient(1, "Stefan", "Ivanov", 85);
    Doctor doctor = new Doctor(1, "Ivo", "Petrov", HospitalSpecialties.ANESTHESIOLOGY);
    ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");


    @Test
    public void testReversedHours() throws IOException {
        for (int i = 0; i < appointments.size(); i++) {
            String expected = String.valueOf(appointments.get(i));
            String actual = Patient.reversedHours(appointments.get(i), "1");
            String msg = "";
            Assert.assertEquals(expected, actual);

        }
    }

    @Test
    public void testToString() {
        Patient p = new Patient(1, "Denitsa", "Stefanova", 25);
        String expected = "Patient{age=25, id=1, firstName='Denitsa', secondName='Stefanova'}";
        String actual = p.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeDateMethod() throws IOException {

        for (int i = 0; i < appointments.size(); i++) {
            String expected = "Appointment{appointmentId=1, patient=Patient{age=25, id=1, firstName='Maria', secondName='Petrova'}, examination=INITIAL, date='15-08-2021', time='1500', doctor=Doctor{speciality=UROLOGY, id=1, firstName='Ivaylo', secondName='Petrov'}}";
            String actual = Patient.cancelAppointment(appointments.get(0));
            String msg = "";
            Assert.assertEquals(expected, actual);
        }
    }
    @Test
    public void testChangeTimeMethod(){

    }
    @Test
    public void testCancelAppointmentMethod(){

    }

}