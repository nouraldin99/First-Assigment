package assigment;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainEmployee {

    static Scanner in = new Scanner(System.in);

    public static void CreateByScanner(Employee[] a1) {
        for (int i = 0; i < a1.length; i++) {
            Employee employee1 = new Employee();
            System.out.println("Enter your name ");
            employee1.setName(in.next());
            System.out.println("Enter your department ");
            employee1.setDepartment(in.next());
            System.out.println("Enter your salary");
            employee1.setSalary(in.nextByte());
            a1[i] = employee1;
        }

    }

    public static void CreateByJOption(Employee[] a2) {
        for (int i = 0; i < a2.length; i++) {
            Employee employee1 = new Employee();
            employee1.setName(JOptionPane.showInputDialog(null, "Enter name : ", "Employee"+(i+1), JOptionPane.INFORMATION_MESSAGE));
            employee1.setDepartment(JOptionPane.showInputDialog(null, "Enter Department : ", "Employee"+(i+1), JOptionPane.INFORMATION_MESSAGE));
            employee1.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter salary : ", "Employee"+(i+1), JOptionPane.INFORMATION_MESSAGE)));
            a2[i] = employee1;
        }
    }

    public static void sortBySalary(Employee[] employees){
        Employee temp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].getSalary() > employees[j].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }
    
    public static void sortByName(Employee[] employees){
        Employee temp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }
    
    public static void scannerShow(Employee[] employees){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            sb.append("\nName : "+employees[i].getName());
            sb.append("\nDepartment : "+employees[i].getDepartment());
            sb.append("\nSalary : "+employees[i].getSalary());
            sb.append("\n-------------------------------------");
        }
        System.out.println(sb.toString());
    }
    
    public static void JOptionShow(Employee[] employees){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            sb.append("\nName : "+employees[i].getName());
            sb.append("\nDepartment : "+employees[i].getDepartment());
            sb.append("\nSalary : "+employees[i].getSalary());
            sb.append("\n-------------------------------------");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        CreateByJOption(employees);
        sortByName(employees);
        JOptionShow(employees);
        System.out.println("Number of Employees = "+Employee.getCount());
    }

}
