package employeedb;

import java.io.IOException;
import java.text.ParseException;


public interface EMP {
     void addEmployee() throws IOException, ParseException;

      void removeEmployee() throws IOException;
      void searchEmployee() throws IOException;
      void displayAll();
      void displayEmp(Integer id);
}
