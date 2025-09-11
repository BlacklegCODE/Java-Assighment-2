
import java.util.*;

public class Assn2
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        Name[] nn = new Name[3];
        
        System.out.print("Enter first name :");
        String first = scanner.next();
        
        System.out.print("Enter middle name :");
        String middle = scanner.next();
        
        System.out.print("Enter last name :");
        String last = scanner.next();
        
        System.out.print(last + " ");
        
        System.out.print(first + " ");
        
        System.out.print(middle.substring(0,1).toUpperCase() + middle.substring(2).toLowerCase());
        
        
    }
}

class Name
{
    String first;
    String middle;
    String last;
    
    Name(String first,String middle, String last)
    {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
}
