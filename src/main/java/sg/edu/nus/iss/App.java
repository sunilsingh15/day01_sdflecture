package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Console con = System.console();
        String name = con.readLine("What is your name? ");

        if (name.length() > 0) {
            System.out.printf("\n Nice to meet you, %s!", name);
        } else {
            System.err.println("You have not told me your name!");
        }
    
        Integer age = 80;

        System.out.printf("\n %s is %d years old.", name, age);


        // Slide 17
        String input = con.readLine("What is your hobby? ");
        input.trim();

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is in Clementi");
        } else if (input.equals("jog")) {
            System.out.println("The nearest park is West Coast Park");
        } else if (input.equals("cycle")) {
            System.out.println("You could cycle along the PCN");
        } else {
            System.out.println("Seems like you are a boring person without hobbies!");
        }
    }
}
