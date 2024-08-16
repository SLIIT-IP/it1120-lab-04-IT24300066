import java.util.Scanner;
public class IT24300066lab4Q2{
public static void main(String []a){
        
        double exam_marks , lab_marks , exam_percentage ,  lab_percentage , total;
        

        Scanner input = new Scanner(System.in);

        System.out.print("please enter exam marks(out of 100): ");
        exam_marks = input.nextDouble();

        if (exam_marks < 0 || exam_marks > 100)
        {
        System.out.println("invalid input for exam marks. terminating program.");
        }
        
        else 
        {
        
          System.out.print("please enter lab submission marks(out of 100): ");
          lab_marks = input.nextDouble();
          
        
          if(lab_marks < 0 || lab_marks > 100)
          System.out.println("invalid input for lab submision marks. terminating program.");
        
          else
          {

            System.out.print("please enter the percentage given for the exam: ");
            exam_percentage = input.nextDouble();
        
            System.out.print("please enter the percentage given for the lab submission: ");
            lab_percentage = input.nextDouble();
            if (exam_percentage + lab_percentage != 100)
            System.out.println("the percentage must add up to 100. terminating program.");
            
            else
            {
            total = (exam_marks * exam_percentage/100) + (lab_marks * lab_percentage/100);
            System.out.println("final exam marks is: "+ total);
            }
          }
        }
        
}
}