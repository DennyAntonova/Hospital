import com.company.Appointment;
import com.company.SortingReversedHoursForDoctor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static com.company.ReadFile.readAppointmentsFromCSV;

public class SortingReversedHoursForDoctorTest {
    ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");

    @Test
    public void testSortingByAppointmentForExaminationOfPatientsInAscendingOrder(){
        ArrayList<Appointment> expected=appointments;
        ArrayList<Appointment> actual= SortingReversedHoursForDoctor.SortingByAppointmentForExaminationOfPatientsInAscendingOrder(appointments);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSortingByAppointmentForExaminationOfPatientsInDescendingOrder(){
        ArrayList<Appointment> expected=appointments;
        ArrayList<Appointment> actual=SortingReversedHoursForDoctor.SortingByAppointmentForExaminationOfPatientsInDescendingOrder(appointments);
   Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSortingByPatientsIdInDescendingOrder(){
        ArrayList<Appointment> expected=appointments;
        ArrayList<Appointment> actual=SortingReversedHoursForDoctor.SortingByPatientsIdInDescendingOrder(appointments);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSortingByPatientsIdInAscendingOrder(){
        ArrayList<Appointment> expected=appointments;
        ArrayList<Appointment> actual=SortingReversedHoursForDoctor.SortingByPatientsIdInAscendingOrder(appointments);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSortingByPatientNameInDescendingOrder(){
        ArrayList<Appointment> expected=appointments;
        ArrayList<Appointment> actual=SortingReversedHoursForDoctor.sortByPatientNameInDescendingOrder(appointments);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSortingByPatientNameInAscendingOrder(){
        ArrayList<Appointment> expected=appointments;
        ArrayList<Appointment> actual=SortingReversedHoursForDoctor.sortByPatientNameInAscendingOrder(appointments);
        Assert.assertEquals(expected,actual);
    }
}
