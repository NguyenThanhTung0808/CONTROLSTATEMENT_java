import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number:");
        int number1 = in.nextInt();
        System.out.print("Input the 2st number:");
        int number2 = in.nextInt();
        System.out.print("Input the 3st number:");
        int number3 = in.nextInt();

        if (number1 > number2)
            if (number1 > number3)
                System.out.println("so lon nhat :" + number1);

        if (number2 > number1)
            if (number2 > number3)
                System.out.println("so lon nhat :" + number2);

        if (number3 > number1)
            if (number3 > number2)
                System.out.println("so lon nhat :" + number3);
    }
}
