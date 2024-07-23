package creational_patterns.prototype;

public class EmployRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
    }

    @Override
    public Prototype getClone() {
        return new EmployRecord(id, name, designation, salary, address);
    }
}
