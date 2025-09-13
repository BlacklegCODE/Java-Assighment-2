//Create four member variables for Customer class. Assign public, private, protected
//and default access modifiers respectively to these variables. Try to access these
//variables from other classes (Same package and Different package)

import java.util.Scanner;

public class NewClass
{
    public static void main(String[] args)
    {
        Customer cus = new Customer(2,3,4);
        
        System.out.println(cus.var1);
        System.out.println(cus.var3);
        // this one is pricate so it cant be accessed ! =>System.out.println(cus.var2);
        
    }
}

class Customer
{
    public int var1;
    private int var2;
    protected int var3;
    
    Customer(int var1, int var2, int var3)
    {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    
    
}  
