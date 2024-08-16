import java.util.Scanner;

public class IT24300066lab4Q1{
  public static void main(String []a){
        double num;   
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        num = input.nextDouble();

        if (num == 0)
        System.out.print("the number is Zero");
        else if (num < 0)
        System.out.print("the number is: negative");
        else System.out.print("the number is: positive");

}

}