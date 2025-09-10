import java.io.*;
import java.util.*;

class Employee
{
    int id;
    String name;
    String deptname;
    int salary;

    Employee(int id, String name, String deptname, int salary)
    {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
    }
    
    void display()
    {
        System.out.println("Id :" + id + " Name : " + name + "Department :" + deptname + " Salary :" + salary);
    }
}

public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees :");
        int n = scanner.nextInt();
        int i;
        
        Employee[] emp = new Employee[n];
        
        
        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the "+i+"th employee detail here");
            System.out.print("Enter ID :");
            int id = scanner.nextInt();
            
            System.out.print("\nEner name :");
            String name = scanner.next();
            
            System.out.print("\nEnter department name :");
            String deptname = scanner.next();
            
            System.out.print("\nEnter the salary of that employee :");
            int sal = scanner.nextInt();
            
            emp[i] = new Employee(id,name,deptname,sal);
        }
        
        
       System.out.println("This is the total number of employees :" + i);
       
       for(i = 0;i<n;i++)
       {
           emp[i].display();
       }
       
    }
}
