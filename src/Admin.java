import java.util.ArrayList;

public class Admin {
    private static final int adminId = 4141;
    private static final String adminPass = "Kri@36";

    private static ArrayList<User> users;
    private static ArrayList<Bus> buses;

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
    }
}
