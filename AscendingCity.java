import java.util.Scanner;
import java.util.Arrays;

public class AscendingCity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        String city[] = {firstCity, secondCity, thirdCity};
        Arrays.sort(city);
        System.out.println(Arrays.toString(city));

    }
}
