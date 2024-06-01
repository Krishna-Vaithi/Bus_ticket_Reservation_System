public class Passenger {
    private String psngrName;
    private int psngrAge;
    private Long mobileNo;

    public Passenger(String psngrName, int psngrAge, Long mobileNo) {
        this.psngrName = psngrName;
        this.psngrAge = psngrAge;
        this.mobileNo = mobileNo;
    }

    public String getPsngrName() {
        return psngrName;
    }

    public void setPsngrName(String psngrName) {
        this.psngrName = psngrName;
    }

    public int getPsngrAge() {
        return psngrAge;
    }

    public void setPsngrAge(int psngrAge) {
        this.psngrAge = psngrAge;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }
}
