import java.util.Scanner;
import java.lang.Math;

public class AreaOfaPentagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex : ");
        double lengthOfV = input.nextDouble();

        double s = (2 * lengthOfV) * (Math.sin(Math.PI/5));
        double area = (5 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/5));
        System.out.println("The Area of Pentagon is " + Math.round(area*100)/100.0);
    }
}
