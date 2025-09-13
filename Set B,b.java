import java.util.Scanner;

public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of players :");
        int n = scanner.nextInt();
        
        CricketPlayer[] player = new CricketPlayer[n];
        
        for(int i = 0;i<n;i++)
        {
        System.out.print("\nEnter player name :");
        String name = scanner.next();
        
        System.out.print("\nEnter total innings of that player :");
        int no_of_innings = scanner.nextInt();
        
        System.out.print("\nEnter times notput :");
        int no_of_times_notout = scanner.nextInt();
        
        System.out.print("\nEnter total runs of that player :");
        int totatruns = scanner.nextInt();
        
        CricketPlayer.avg(no_of_innings,no_of_times_notout,totatruns);

        player[i] = new CricketPlayer(name,no_of_innings,no_of_times_notout,totatruns);
        }    


        CricketPlayer.sorter(player, n);
        
        for(int i = 0;i<n;i++)
        {
            System.out.println(player[i].name + " " + player[i].no_of_innings + " " + player[i].no_of_times_notout + " " + player[i].totatruns );
        }
    }
}

// question :Define a class CricketPlayer (). Create an array of n player objects .Calculate the batting average for each
//player using static method avg(). Define a static sort method which sorts the array on
//the basis of average. Display the player details in sorted order.

class CricketPlayer
{
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totatruns;
    double avg;
    
    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totatruns)
    {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totatruns = totatruns;
    }
    
    static double avg(int no_of_innings, int no_of_times_notout, int totatruns)
    {
        return (double) totatruns/(no_of_innings - no_of_times_notout);
    }
    
    static void sorter(CricketPlayer[] player, int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(player[j].avg < player[j+1].avg)
                {
                    CricketPlayer temp = player[j];
                    player[j] = player[j+1];
                    player[j+1] = temp;
                }
                    
            }
        }
    }
}
