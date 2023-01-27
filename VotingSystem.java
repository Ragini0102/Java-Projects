import java.util.Scanner;

public class VotingSystem {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);        // Scanner Function
        // Variable declaration
        String BJP = "Lotus";
        String BSP = "Elephant";
        String SP = "Hand";
        System.out.println("Welcome to EVM(Electronic Voting Machine)");        // Print Party names.
        System.out.println("-----------------------------------------");
        System.out.println("1. BJP");
        System.out.println("--------");
        System.out.println("2. BSP");
        System.out.println("--------");
        System.out.println("3. SP");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("These are some opposite parties for election, We are request you to donate your vote for any one party and choose there party number");
        // Using For-loop for n times of voting with EVM
        for (int i = 0; i < 1000000000; i++) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("Enter party Number = ");
            int vote = sc.nextInt();        // Extract input from user
            // Conditional Statement of EVM
            if (vote == 1){
                System.out.println("-----------------------------------------------");
                System.out.println("Your vote successfully submitted to BJP 😉😎🙂");
                System.out.println("-----------------------------------------------");
            } else if (vote==2) {
                System.out.println("-----------------------------------------------");
                System.out.println("Your vote successfully submitted to BSP 😎😉🙂");
                System.out.println("-----------------------------------------------");
            } else if (vote == 3) {
                System.out.println("----------------------------------------------");
                System.out.println("Your vote successfully submitted to SP 🙂😎😉");
                System.out.println("----------------------------------------------");
            }
            else
                System.out.println("Sorry invalid entry");

        }
    }
}

// The End of the project.😎😎😎😎