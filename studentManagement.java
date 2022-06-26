import java.util.Scanner;

public class studentManagement 
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an number for an option");
        String input = userInput.nextLine();
        int userInputAnswer = Integer.valueOf(input);

        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        
        switch(userInputAnswer)
        {
            case 1: 
            //adds the student

            break;
            
            case 2: 
            //views the student

            break;
        }
    }

    
}
