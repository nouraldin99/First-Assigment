
package assigment;

public class Employee {

    private String name ;
   private String department ;
   private double Salary ;
   public static int count ;
 public Employee(){
 count++;
 }
    public static int getCount() {
        return count;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setSalary(double Salary, double bonus) {
        this.Salary += Salary * (bonus/100);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", department=" + department + ", Salary=" + Salary + '}';
    }
   
   
   
    
}
