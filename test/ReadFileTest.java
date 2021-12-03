import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static com.company.ReadFile.*;

public class ReadFileTest {
    ArrayList<User> patients = readPatientsFromCSV("patients");
    ArrayList<User> doctors = readDoctorsFromCSV("doctors");


    @Test
    public void testFindPatientById() {
        int idPatient = 1;
        Patient expected = (Patient) patients.get(0);
        Patient actual = ReadFile.findPatientById(patients, idPatient);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindDoctorById() {
        int idDoctor = 10;
        Doctor expected = (Doctor) doctors.get(9);
        Doctor actual = ReadFile.findDoctorById(doctors, idDoctor);
        Assert.assertEquals(expected, actual);
    }
}
