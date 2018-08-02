/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tristesse08
 */
public class Employee {
    protected String name;
    private int employeeId;
    private double salary;
    String payRate;
    private String joinDate;
    private String typeOfEmployee;
    private int hours;
    
    public Employee(String name,double salary,String payRate,String joinDate,String typeOfEmployee){
    this.name=name;
    this.salary=salary;
    this.payRate=payRate;
    this.joinDate=joinDate;
    this.typeOfEmployee=typeOfEmployee;
    }
    
    public Employee(String name,int employeeId,double salary,String payRate,String joinDate,String typeOfEmployee,int hours){
    this.employeeId=employeeId;
    this.name=name;
    this.salary=salary;
    this.payRate=payRate;
    this.joinDate=joinDate;
    this.typeOfEmployee=typeOfEmployee;
    this.hours=hours;
    }
    
    public String toString(){
        return("Name: "+this.name+"\n"+"employee Id: "+this.employeeId+"\n"+"salary: "+this.salary+"\n"+"pay Rate: "+this.payRate+"\n"+" Join Date"+this.joinDate+"\n"+"Employee Type: "+this.typeOfEmployee+"\n"+"Hours: "+this.hours);
    }
    void compareSalary(Employee current){
        if(this.salary>current.salary){
            System.out.println(this.name +" has more money than "+current.name);
        }
    }
    
    boolean isSalaryHiger(Employee current){
        if(this.salary>current.salary){
            return true;
        }
        else{
            return false;
        }
    }
}
