import com.company.Appointment;
import com.company.ReadFile;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
public class GroupPatientsTest {

    ArrayList<Appointment> appointments = ReadFile.readAppointmentsFromCSV("appointments");

    @Test
    public void testGroupByNameDoctorsWhenReadFilefromCsvNoObject() {
        Assert. assertNotNull("No Object when read csv file appointments", appointments);
    }
    @Test
    public void testGroupByNameDoctorsWhenPrintResult(ArrayList<Appointment>appointments){


    }
}
