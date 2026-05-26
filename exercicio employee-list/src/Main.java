import entites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>();

        for(int i = 0; i < quantity; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            employeeList.add(emp);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(employeeList, idSalary);
        if(pos == null){
            System.out.print("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employeeList.get(pos).increaseSalary(percentage);

        }
        System.out.println();
        System.out.println("List of employees:");
        for(Employee employee : employeeList) {
            System.out.println(employee);
        }
        sc.close();
    }
    public static Integer position(List<Employee> employeeList, int id) {
        for(int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}