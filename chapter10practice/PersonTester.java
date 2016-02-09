import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      Person[] attendance=new Person[10];
      for (int i=0; i<attendance.length;i++)
      {
          System.out.print("What is the name of your person? ");
          attendance[i]= new Person(s.next());
        }
      for (int i=0; i<attendance.length-1;i++)
      {
          for (int j=0; j<attendance.length-i-1;j++)
          {
              if (attendance[j].compareTo(attendance[j+1])>0)
              {
                  Person swap = attendance[j];
                  attendance[j]=attendance[j+1];
                  attendance[j+1]=swap;
                }
            }
        }
      for (int i=0; i<attendance.length;i++)
      {
          System.out.println(attendance[i]);
        }
    }
}
