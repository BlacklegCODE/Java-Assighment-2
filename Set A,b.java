import java.util.Arrays;
import java.util.Scanner;


class Student
{
    String name;
    float percentage;
    int roll;


    Student(int roll, String name, float percentage)
    {
        this.name = name;
        this.roll = roll;
        this.percentage = percentage;
    }


    static void sortStudent(Student[] stud, int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(stud[j].percentage < stud[j+1].percentage)
                {
                    Student temp = stud[j];
                    stud[j] = stud[j+1];
                    stud[j+1] = temp;
                }
            }
        }
    }
}
public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter total students :");

        int n = scanner.nextInt();

        Student[] stud = new Student[n];

        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter student roll number " + i+1 + " here :");
            int roll = scanner.nextInt();

            System.out.print("Enter student name " + i+1 + " here :");
            String name = scanner.next();

            System.out.print("Enter student percentage " + i+1 + " here :");
            float percentage = scanner.nextFloat();

            stud[i] = new Student(roll,name,percentage);
        }


        Student.sortStudent(stud,n);

        for(int i = 0;i<n;i++)
        {
            System.out.println(stud[i].roll + " " + stud[i].name + " " + stud[i].percentage);
        }
    }
}
