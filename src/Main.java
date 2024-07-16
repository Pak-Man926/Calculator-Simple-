import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        int no1;

        int no2;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number:");

        no1 = obj.nextInt();

        System.out.println("Enter the second number:");

        no2 = obj.nextInt();

        char calculate;

        System.out.println("Enter the value:");

        calculate = obj.next().charAt(0);

        switch(calculate)
        {

            case '+':
                System.out.println("Addition: " +(no1 + no2));
                break;


            case '-':
                System.out.println("Subtraction: " +(no1 - no2));
                break;


            case '*':
                System.out.println("Multiplication: " +(no1 * no2));
                break;


            case '/':
                System.out.println("Division: " +(no1 / no2));
                break;

            default:
                System.out.println("Not Valid!");

        }



    }

}