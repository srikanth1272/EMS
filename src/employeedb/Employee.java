package employeedb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Employee {
    private Integer id;
    private String first_name;
    private String last_name;
    private Date dob;
    private String email;
    private String contact;

    public Employee() {
    }

    public Employee(Integer id, String first_name, String last_name, String dob, String email, String contact) throws ParseException {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.dob = dateFormat.parse(dob);
        this.email = email;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId().equals(employee.getId());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
