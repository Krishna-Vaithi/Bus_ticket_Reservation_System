import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);
    public static void addBus() {
        System.out.println("Enter Bus Number");
        int busNo = sc.nextInt();
        System.out.println("Enter Total Seats");
        int totalSeats = sc.nextInt();
        System.out.println("Enter Current Capacity");
        int currentCapacity = sc.nextInt();
        Admin.addBus(new Bus(busNo, totalSeats, currentCapacity));
    }

    public static void removeBus() {
        System.out.println("Enter Bus Number to remove");
        int busNo = sc.nextInt();
        for (Bus bus : Admin.getBuses()) {
            if (bus.getBusNo() == busNo) {
                Admin.removeBus(bus);
                System.out.println("Bus Removed Successfully");
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
}
