import java.util.Scanner;
public class Exercise
{
public static void main(String[] args)
{
 Scanner in=new Scanner(System.in);
 System.out.print("Inputa string");
 String str=in.nextLine();
 System.out.println("The middle charecter in the sting:+middle(str)+"\n");
 }
 public static String middle(String str)
  {
    int position;
    int length;
    if(str.length() % 2==0)
    {
      position=str.length();
      length=2;
     }
    else
    {
     position =str.length();
     length=1;
     }
    return str.substring(position,position+length);
   }
 }




