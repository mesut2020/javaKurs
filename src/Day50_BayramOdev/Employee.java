package Day50_BayramOdev;

public class Employee extends Person {
    School school;
    private int salary;

    public Employee(String name, String address,int salary) {
        super(name, address);
        setSchool(school);
        setSalary(salary);
    }

    public School getSchool() {
        return school;
    }
    public void setSchool(School school) {
        this.school = school;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee" +
                "\nname: " + getName() +
                "\naddress: " + getAddress() +
                "\nsalary: $" + salary;
    }


}
