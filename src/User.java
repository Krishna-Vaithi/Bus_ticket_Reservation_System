import java.util.ArrayList;

public class User {
    private int userId;
    private String userPassword;
    private ArrayList<Passenger> psngrList;

    public User(int userId, String userPassword, ArrayList<Passenger> psngrList) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.psngrList = psngrList;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public ArrayList<Passenger> getPsngrList() {
        return psngrList;
    }
}
