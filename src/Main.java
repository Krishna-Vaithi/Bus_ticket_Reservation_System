import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Bus Reservation System");
            System.out.println("Enter your choice");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Admin ID");
                    int adminId = sc.nextInt();
                    System.out.println("Enter Admin Password");
                    String adminPass = sc.next();
                    if (adminId == Admin.getAdminId() && adminPass.equals(Admin.getAdminPass())) {
                        System.out.println("Login Successful");
                        System.out.println("Welcome Admin");
                        System.out.println("1. Add Bus");
                        System.out.println("2. Remove Bus");
                        System.out.println("3. View Buses");
                        int adminChoice = sc.nextInt();
                        switch (adminChoice) {
                            case 1:
                                Methods.addBus();
                                break;
                            case 2:
                                Methods.removeBus();
                                break;
                            case 3:
                                Methods.viewBuses();
                                break;
                            default:
                                System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Invalid Credentials");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
