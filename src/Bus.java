public class Bus {
    private int busNo;
    private int totalSeats;
    private int currentCapacity;

    public Bus(int busNo, int totalSeats) {
        this.busNo = busNo;
        this.totalSeats = totalSeats;
        this.currentCapacity = totalSeats;
    }

    public int getBusNo() {
        return busNo;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
