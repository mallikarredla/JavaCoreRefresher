package main.java.com.mallik.OOPConcepts;

import java.text.DecimalFormat;

public class Employee {
    private String name;
    private int employeeId;
    private int basicSalary;
    private int deduction;
    private int bonus;
    public Employee(String name,int employeeId,int basicSalary,int deduction,int bonus){
        this.employeeId=employeeId;
        this.name=name;
        this.basicSalary=basicSalary;
        this.bonus=bonus;
        this.deduction=deduction;

    }
    public double CalculateNetsalary(){
        return basicSalary-deduction+bonus;
    }
    public   void  employeeDetails(){
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("\n -----Employee Details  ");
        System.out.println("Name " +name);
        System.out.println("employeeId " +employeeId);
        System.out.println("employeeBasic salary " +basicSalary);
        System.out.println("employee deduction " +deduction);
        System.out.println("employee bonus " +bonus);
        System.out.println("----------------");
        System.out.println("calculatedNetSalary " +CalculateNetsalary());
        System.out.println("------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

