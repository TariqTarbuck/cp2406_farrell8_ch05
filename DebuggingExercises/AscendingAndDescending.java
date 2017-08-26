import java.util.ArrayList;
import java.util.Scanner;

public class AscendingAndDescending {

        public static void main(String[] args) {
            ArrayList<String> userInputs = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            while (true){
            System.out.println("Please enter an interger");
            userInputs.add(input.next());
            userInputs.sort(input);
            System.out.println();

        }
    }

}
