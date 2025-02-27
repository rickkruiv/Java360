package javaCollectionsMain.lists;

public class Employee {

    enum Status {
        ACTIVE, INACTIVE
    }

    private final String name;
    private final Status status;

    public Employee(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", status=" + status +
            '}';
    }
}
