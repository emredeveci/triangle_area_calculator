
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables needed for this calculator
        double sideOne, sideTwo, sideThree, semiPerimeter, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        sideOne = input.nextDouble();

        System.out.print("Enter the length of the second side: ");
        sideTwo = input.nextDouble();

        System.out.print("Enter the length of the third side: ");
        sideThree = input.nextDouble();

        //calculate the semiperimeter needed to calculate the area of a triangle
        semiPerimeter = (sideOne + sideTwo + sideThree) / 2;

        //calculate the area of a triangle when gives the length of its three sides
        area = Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));

        System.out.println("The area of the triangle is: " + area);
    }
}