
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(41, "negris", "armagan" ));
        employees.add(new Employee(26, "arif", "ercik" ));
        employees.add(new Employee(41, "negris", "armagan" ));

        LinkedList<Employee> duplicateEmployees = new LinkedList<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee employee : employees) {
            if (!employeeMap.containsKey(employee.getId())) {
                employeeMap.put(employee.getId(), employee);
            } else {
                duplicateEmployees.add(employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);
        System.out.println("REMOVED" + duplicateEmployees);


    }
}