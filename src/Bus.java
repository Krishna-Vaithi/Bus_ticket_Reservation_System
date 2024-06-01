public class Bus {
    private int busNo;
    private int totalSeats;
    private int currentCapacity;

    public Bus(int busNo, int totalSeats, int currentCapacity) {
        this.busNo = busNo;
        this.totalSeats = totalSeats;
        this.currentCapacity = currentCapacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
