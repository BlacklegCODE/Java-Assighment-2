//Main file Main.java

import java.util.Scanner;
import SYM.*;
import TYM.*;
public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter score for Computer :");
        int comp = scanner.nextInt();
        
        System.out.print("\nEnter score for Maths :");
        int math = scanner.nextInt();
        
        System.out.print("\nEnter score for Electronics :");
        int elec = scanner.nextInt();
        
        System.out.print("\nEnter score for Theory :");
        int theo = scanner.nextInt();
        
        System.out.print("\nEnter score for Practical :");
        int prac = scanner.nextInt();
        
        SYMarks sy = new SYMarks(comp,math,elec);
        TYMarks ty = new TYMarks(theo,prac);
        
        int totalComp = sy.ComputerTotal + sy.MathsTotal + sy.ElectronicsTotal + ty.Practical + ty.Theory;
    
        // (‘A’ for >= 70,   ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for >= 40 else ‘FAIL’) 
        
        String grade;

        if(totalComp >= 70) grade = "a";
        else if(totalComp >= 60) grade = "b";
        else if(totalComp >= 50) grade = "c";
        else if(totalComp >= 40) grade = "d";
        else grade = "Fail";
        
        System.out.print("\n\nThis is the grade :" + grade.toUpperCase());
        
        System.out.println("--------------------------------------------\n");
        System.out.println("Result Declared :");
        System.out.println("Computer :" + sy.ComputerTotal);
        System.out.println("Maths :" + sy.MathsTotal);
        System.out.println("Electronics :" + sy.ElectronicsTotal);
        System.out.println("TY Practical :" + ty.Practical);
        System.out.println("TY Theory :" + ty.Theory);
        System.out.println("--------------------------------------------\n");
                                
       
    }
}

class Students
{
    int rollNumber;
    String name;
    int SYMarks;
    int TYMarks;
    
    
    Students(int rollNumber,String name,int SYMarks, int TYMarks)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.SYMarks = SYMarks;
        this.TYMarks = TYMarks;
    }   
    
    
}

//SYMarks.java package

package SYM;


public class SYMarks 
{
    public int ComputerTotal;
    public int MathsTotal;
    public int ElectronicsTotal;
   
    
    public SYMarks(int ComputerTotal, int MathsTotal, int ElectronicsTotal)
    {
        this.ComputerTotal = ComputerTotal;
        this.MathsTotal = MathsTotal;
        this.ElectronicsTotal = ElectronicsTotal;
        
    } 
}

//TYMarks.java package


package TYM;

public class TYMarks 
{
    public int Theory;
    public int Practical;
    
    public TYMarks(int Theory, int Practical)
    {
        this.Theory = Theory;
        this.Practical = Practical;
    }
    
}

