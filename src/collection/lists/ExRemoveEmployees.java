package collection.lists;

import java.util.ArrayList;
import java.util.List;

import static collection.lists.Employee.Status.ACTIVE;
import static collection.lists.Employee.Status.INACTIVE;

public class ExRemoveEmployees {

    public static void main(String[] args) {
        var employees = List.of(
            new Employee("Emp A", ACTIVE),
            new Employee("Emp B", INACTIVE),
            new Employee("Emp C", ACTIVE),
            new Employee("Emp D", INACTIVE),
            new Employee("Emp E", INACTIVE),
            new Employee("Emp F", ACTIVE)
        );

        var activeEmployees = removeInactive(employees);
        System.out.println(employees);
        System.out.println(activeEmployees);
    }

    private static List<Employee> removeInactive(List<Employee> employees) {
        var activeEmployees = new ArrayList<Employee>();
        activeEmployees.addAll(employees);

        var iter = activeEmployees.iterator();
        while (iter.hasNext()) {
            if (iter.next().getStatus() == INACTIVE) {
                iter.remove();
            }
        }

        return activeEmployees;
    }
}
