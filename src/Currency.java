// Question
// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rupees:");
        float   rupees = sc.nextFloat();
        float dollars = rupees /70;

        System.out.println(dollars + " Dollars");
    }

}
