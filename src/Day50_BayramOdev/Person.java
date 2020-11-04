package Day50_BayramOdev;

public class Person {
/*
    Part 1: Create inheritance as in following picture

    Part 2: In toString methods of Student show in example below
            Student
    name: John
    address: Main 1011
    fee: $1000


    In toString methods of Employee show in example below
            Employee
    name: Max
    address: Lower st 15
    salary: $60_000

    Part 3: Add properties to School class as in picture

    Part 4: Create class SchoolManagement,
            register some students and employees to your school
            (Hint: constructors)
*/

    private String name;
    private String address;

    public Person(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
