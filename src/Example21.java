import java.util.Scanner;

public class Example21 {
    public static void main(String[] args){
        int positives, i , num;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter a Number:");
        i=inputValue.nextInt();

        i = 0;
        positives = 0;
        while (i < 10) {
            num = inputValue.nextInt();
            if (num >= 0) {
                positives = positives + 1;
            }
            i++;
        }
        System.out.println(positives + " positives");
    }
}
