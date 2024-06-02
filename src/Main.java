import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
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
                        boolean adminFlag = true;
                        while (adminFlag) {
                            System.out.println("1. Add Bus \n" + "2. Remove Bus\n" + "3. View Buses\n" + "4. Logout");
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
                                case 4:
                                    System.out.println("Logging out...");
                                    adminFlag = false;
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                        } else {
                        System.out.println("Invalid Credentials");
                    }
                    break;
                case 2:
                    System.out.println("1. New User \n2. Existing User");
                    int userChoice = sc.nextInt();
                    if (userChoice == 1) {
                        Methods.addUser();
                    }
                    User user = Methods.validateUser();
                    boolean userFlag = true;
                    while (userFlag){
                    if(user != null) {
                        System.out.println("1. Book Ticket\n" + "2. View Ticket\n" +
                                "3. Cancel Ticket\n" + "4. Logout");
                        int userChoice2 = sc.nextInt();
                        switch (userChoice2) {
                            case 1:
                              Methods.BookTicket(user);
                                break;
                            case 2:
                                Methods.viewTicket(user);
                                break;
                            case 3:
                                Methods.cancelTicket(user);
                                break;
                            case 4:
                                System.out.println("Logging out...");
                                userFlag=false;
                                break;
                            default:
                                System.out.println("Invalid Choice");
                        }
                    }
                    else {
                        System.out.println("Invalid Credentials");
                        break;
                    }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
