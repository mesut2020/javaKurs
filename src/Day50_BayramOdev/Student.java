package Day50_BayramOdev;

public class Student extends Person {
    School school;
    private int fee;

    public Student(String name, String address, int fee) {
        super(name, address);
        setSchool(school);
        setFee(fee);
    }

    public School getSchool() {
        return school;
    }
    public void setSchool(School school) {
        this.school = school;
    }

    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "\nStudent" +
                "\nname: " + getName() +
                "\naddress: " + getAddress() +
                "\nfee: $" + fee;
    }
}

