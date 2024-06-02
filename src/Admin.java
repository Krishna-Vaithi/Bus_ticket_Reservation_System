import java.util.ArrayList;

public class Admin {
    private static final int adminId = 4141;
    private static final String adminPass = "Kri@36";

    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Bus> buses= new ArrayList<>();

    public static int getAdminId() {
        return adminId;
    }
    public static String getAdminPass() {
        return adminPass;
    }

    public static void addBus(Bus bus) {
        buses.add(bus);
        System.out.println("Bus Added Successfully");
    }

    public static Bus[] getBuses() {
        return buses.toArray(new Bus[0]);
    }

    public static void removeBus(Bus bus) {
        buses.remove(bus);
        System.out.println("Bus Removed Successfully");
    }

    public static void addUser(User user) {
        users.add(user);
        System.out.println("User Added Successfully");
    }

    public static User[] getUsers() {
        return users.toArray(new User[0]);
    }

    public static void setPassenger(Passenger passenger, int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                user.getPsngrList().add(passenger);
                System.out.println("Passenger Added Successfully");
                return;
            }
        }
        System.out.println("User Not Found");
    }
}
