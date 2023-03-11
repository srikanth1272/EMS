package employeedb;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EmployeeBO ebo = new EmployeeBO();
        while (true) {
            System.out.println("1.add employee");
            System.out.println("2.remove employee");
            System.out.println("3.search employee");
            System.out.println("4.display employees");
            System.out.println("0.exit");
            System.out.println("Enter your choice:");
            int n = Integer.parseInt(br.readLine().trim());
            switch (n){
                case 1:{
                    ebo.addEmployee();
                }
                break;
                case 2:{

                    ebo.removeEmployee();
                }
                break;
                case 3:{

                    ebo.searchEmployee();
                }
                break;
                case 4:{
                    ebo.displayAll();
                }
                break;
                case 0:System.exit(0);
                break;
                default:System.out.println("Invalid choice");
                break;
            }
        }


    }
}
