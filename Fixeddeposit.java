import java.util.Scanner;

public class FixedDeposit {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        char check = 'y';
        while(check == 'y') {

            System.out.println("Enter your Principal amount, Time, and Rate");

            double P = input.nextDouble();
            double T = input.nextDouble();
            double R = input.nextDouble();

            double A = 0;
            double F = 0;

            if(P >= 1000 && T >= 0 && T <= 5 && R >= 8 && R <= 10) {

                System.out.println("Principal: " + P);
                System.out.println("Annual Rate: " + R);
                System.out.println("Monthly Rate: " + (R/100)/10);
                System.out.println("Time in Years: " + T);
                System.out.println("Time in Months: " + T*12);

                A = P * Math.pow((1 + (R/100)/10), 12*T);

                System.out.println("Maturity Amount (before fees): " + A);

                System.out.println("Fee Rate : 0.5%");
                F = A * 0.005;

                System.out.println("Fee Amount : " + F);
                System.out.println("Final Amount : " + (A - F));

            } else {
                System.out.println("Invalid input. Please try again.");
            }

            System.out.println("If you would like to continue, press y, otherwise press n");
            check = input.next().charAt(0);
        }

        input.close();
    }
}
