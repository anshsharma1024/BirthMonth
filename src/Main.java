import java.util.Scanner;

class BirthMonth {
    void main()
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        // Ask the user for their birth month
        System.out.print("Enter your birth month [1-12]: ");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();  // Clear the newline from the key buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid whole number not " + trash);
            System.out.println("Rerun the program and try again!");
            System.exit(0);
        }

        // If the month is between 1 and 12 inclusive, echo it, otherwise show an error
        if(birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}