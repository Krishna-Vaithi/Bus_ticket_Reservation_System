import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);
    public static void addBus() {
        System.out.println("Enter Bus Number");
        int busNo = sc.nextInt();
        System.out.println("Enter Total Seats");
        int totalSeats = sc.nextInt();
        Admin.addBus(new Bus(busNo, totalSeats));
    }

    public static void removeBus() {
        System.out.println("Enter Bus Number to remove");
        int busNo = sc.nextInt();
        for (Bus bus : Admin.getBuses()) {
            if (bus.getBusNo() == busNo) {
                Admin.removeBus(bus);
                return;
            }
        }
    }

    public static void viewBuses() {
        for (Bus bus : Admin.getBuses()) {
            System.out.println("Bus Number: " + bus.getBusNo());
            System.out.println("Total Seats: " + bus.getTotalSeats());
            System.out.println("Current Capacity: " + bus.getCurrentCapacity());
        }
    }

    public static void addUser() {
        System.out.println("Enter User ID");
        int userId = sc.nextInt();
        System.out.println("Enter User Password");
        String userPassword = sc.next();
        Admin.addUser(new User(userId, userPassword, new ArrayList<Passenger>()));
    }

    public static User validateUser() {
        System.out.println("Enter User ID");
        int userId = sc.nextInt();
        System.out.println("Enter User Password");
        String userPass = sc.next();
        for (User user : Admin.getUsers()) {
            if (user.getUserId() == userId && user.getUserPassword().equals(userPass)) {
                System.out.println("Login Successful");
                return user;
            }
        }
        System.out.println("Invalid Credentials");
        return null;
    }

    public static void BookTicket(User user) {
        System.out.println("Enter Bus Number");
        int busNo = sc.nextInt();
        System.out.println("Enter Number of Seats");
        int seats = sc.nextInt();
        for (Bus bus : Admin.getBuses()) {
            if (bus.getBusNo() == busNo) {
                if (bus.getCurrentCapacity() >= seats) {
                    for (int j = 0; j < seats; j++) {
                        System.out.println("Enter Passenger Name");
                        String name = sc.next();
                        System.out.println("Enter Passenger Age");
                        int age = sc.nextInt();
                        System.out.println("Enter Passenger Mobile Number");
                        long mobile = sc.nextLong();
                        Admin.setPassenger(new Passenger(name, age, mobile), user.getUserId());
                        bus.setCurrentCapacity(bus.getCurrentCapacity() - 1);
                    }
                    return;
                } else {
                    System.out.println("Number of Seats not available");
                }
            }
        }
        System.out.println("Bus not found");
            return;
        }

    public static void viewTicket(User user) {
        if (user.getPsngrList().isEmpty()) {
            System.out.println("No Ticket Booked");
            return;
        }
        for (Passenger passenger : user.getPsngrList()) {
            System.out.println("Passenger Name: " + passenger.getPsngrName());
            System.out.println("Passenger Age: " + passenger.getPsngrAge());
            System.out.println("Passenger Mobile: " + passenger.getMobileNo());
        }
    }

    public static void cancelTicket(User user) {
        System.out.println("Enter Bus Number");
        int busNo = sc.nextInt();
        for (Bus bus : Admin.getBuses()) {
            if (bus.getBusNo() == busNo) {
                if(user.getPsngrList().isEmpty()) {
                    System.out.println("No Ticket Booked");
                    return;
                }
                bus.setCurrentCapacity(bus.getCurrentCapacity() + user.getPsngrList().size());
                user.getPsngrList().clear();
                System.out.println("Ticket Cancelled Successfully");
                return;
            }
        }
        System.out.println("Bus not found");
    }
}
