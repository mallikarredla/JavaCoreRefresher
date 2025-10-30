package main.java.com.mallik.OOPConcepts;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee emp1 = new Employee("john", 123, 80000, 8000, 250);
        Employee emp2 = new Employee("Akash", 456, 90000, 9000, 260);
        emp1.setBonus(500);
        emp2.setName("Amit");
        emp2.setBonus(1000);
        // Print formatted salary slips
        emp1.employeeDetails();
        emp2.employeeDetails();
    }


    }

