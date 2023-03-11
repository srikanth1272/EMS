package employeedb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class EmployeeBO implements EMP {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Employee> emp = new ArrayList<>();
    Employee ob1 = new Employee(101,"ros","taylor","12-02-2002","ros@gmail.com","9932443434");
    Employee ob2 = new Employee(102,"jos","taylor","11-02-2002","jos@gmail.com","9932443435");


    public EmployeeBO() throws ParseException {
        emp.add(ob1);
        emp.add(ob2);
    }


    @Override
    public void addEmployee() throws IOException, ParseException {
        System.out.println("Enter employee details in csv format:(id,first_name,last_name,dob(dd-MM-yyyy),email,contact)");
        String[] s = (br.readLine()).split(",");
        Integer id = Integer.parseInt(s[0]);
        Employee temp = new Employee();
        temp.setId(id);
        if(!emp.equals(temp)) {
            Employee ob = new Employee(Integer.parseInt(s[0]), s[1], s[2], s[3], s[4], s[5]);
            emp.add(ob);
            System.out.println("Successfully added.");
        }else{
            System.out.println("ID has already been used");
        }
    }

    @Override
    public void removeEmployee() throws IOException {
        System.out.println("Enter employee id:");
        Integer id = Integer.parseInt(br.readLine().trim());
        Employee temp = new Employee();
        temp.setId(id);
        int k =-1;

        k = emp.indexOf(temp);

     if(k != -1){
         emp.remove(k);
         System.out.println("Successfully deleted.");
     }else {
         System.out.println("There is no employee with the given id.");
     }
    }

    @Override
    public void searchEmployee() throws IOException {
        System.out.println("Enter employee id:");
        Integer id = Integer.parseInt(br.readLine().trim());
        Employee temp = new Employee();
        temp.setId(id);
        int k = -1;

        k = emp.indexOf(temp);

        if(k != -1){
            displayEmp(k);

        }else {
            System.out.println("There is no employee with the given id.");
        }

    }

    @Override
    public void displayAll() {
       System.out.println("Size:"+emp.size());
        for (Employee employee : emp) {
            System.out.println(employee.toString());
        }

    }

    @Override
    public void displayEmp(Integer id) {
        System.out.println(emp.get(id).toString());
    }
}
