import java.util.Scanner;

public class IT24300066lab4Q3{
  public static void main(String []a){
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter a number: ");
        double num = input.nextDouble();

        String result = num > 0 ? "the number is : positive" : 
                        (num < 0 ? "the number is : negative" : "the number is : zero" );
                         
                        
        System.out.print(result);

}

}