//main file :
// Write a package for String operation which has two classes Con and Comp. Con class
// has to concatenates two strings and comp class compares two strings. Also display
// proper message on execution.
import java.util.Scanner;
import comp.*;
import conc.*;


public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string here");
        String first = scanner.nextLine();
        
        System.out.print("Enter second string here :");
        String second = scanner.nextLine();
        
        compare c = new compare(first,second);
        concat t = new concat(first,second);
        
        System.out.println("Comparison :");
        System.out.println(c.comparer(first, second));
        
        System.out.println("----------------------------------------");
        System.out.println("Concatenation :");
        System.out.println(t.concater(first,second));
    }
}

//comparing file :

package comp;


public class compare 
{
    public String one;
    public String two;
    
    public compare(String one,String two)
    {
        this.one = one;
        this.two = two;
    }
    
    public static String comparer(String one,String two)
    {
        if(one.equals(two))
            return (String ) "Both are same !";
        else
            return (String) "Both are not same !";
    }
}


//concatenating file :


package conc;

public class concat 
{
    public String one;
    public String two;
    
    public concat(String one, String two)
    {
        this.one = one;
        this.two = two;
    }
    
    public static String concater(String one, String two)
    {
        return (String) one + two;
    }
}





