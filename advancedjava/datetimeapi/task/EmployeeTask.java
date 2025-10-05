package advancedjava.datetimeapi.task;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

class Employee {
    int id;
    String name;
    LocalDate joiningDate;
    LocalDate relivingDate;
    String department;

    public Employee(int id, String name, LocalDate joiningDate, LocalDate relivingDate, String department) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
        this.relivingDate = relivingDate;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public LocalDate getRelivingDate() {
        return relivingDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setRelivingDate(LocalDate relivingDate) {
        this.relivingDate = relivingDate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return id +
                ", " + name +
                ", " + joiningDate +
                ", " + relivingDate +
                ", " + department;
    }
}

public class EmployeeTask {
    static List<Employee> employeeList = new ArrayList<>();
    private static void addEmployee() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        employeeList = Arrays.asList(
                new Employee(101, "Raja", LocalDate.parse("20/12/2002", formatter), LocalDate.parse("20/12/2013", formatter), "Frontend"),
                new Employee(102, "Mani", LocalDate.parse("15/03/2003", formatter), LocalDate.parse("18/07/2006", formatter), "Frontend"),
                new Employee(103, "Arun", LocalDate.parse("05/06/2004", formatter), LocalDate.parse("10/06/2015", formatter), "Frontend"),
                new Employee(104, "Kumar", LocalDate.parse("22/09/2002", formatter), LocalDate.parse("25/10/2005", formatter), "Backend"),
                new Employee(105, "Siva", LocalDate.parse("12/01/2005", formatter), LocalDate.parse("14/01/2018", formatter), "Backend"),
                new Employee(106, "Vijay", LocalDate.parse("10/02/2006", formatter), LocalDate.parse("12/04/2009", formatter), "Backend"),
                new Employee(107, "Ajith", LocalDate.parse("08/04/2006", formatter), LocalDate.parse("10/08/2011", formatter), "SD"),
                new Employee(108, "Muthu", LocalDate.parse("01/07/2007", formatter), LocalDate.parse("01/07/2011", formatter), "SD"),
                new Employee(109, "Deepak", LocalDate.parse("20/10/2007", formatter), LocalDate.parse("20/12/2011", formatter), "HR"),
                new Employee(110, "Karthik", LocalDate.parse("11/12/2003", formatter), LocalDate.parse("15/12/2011", formatter), "HR")
        );
    }

    private static void groupByExp() {
        Map<Long, String> map = employeeList.stream()
                .collect(Collectors.groupingBy(x-> ChronoUnit.YEARS.between(x.getJoiningDate(), x.getRelivingDate()), Collectors.mapping(em->em.getName(), Collectors.joining(",","{","}"))));
        map.forEach((k,v)-> System.out.println(k + " => " + v));
    }

    private static void longExp() {
//        String exp = employeeList.stream()
//                .collect(Collectors.collectingAndThen(
//                        Collectors.maxBy((x,y) ->
//                                Long.compare(
//                                        ChronoUnit.YEARS.between(x.joiningDate, x.relivingDate),
//                                        ChronoUnit.YEARS.between(y.joiningDate, y.relivingDate)
//                                )
//                        ),
//                        emp -> emp.map(e ->
//                                        e.name + " => " + ChronoUnit.YEARS.between(e.joiningDate,e.relivingDate))
//                                .orElse("No data")
//                ));
        String exp = employeeList.stream()
                .collect(Collectors.maxBy((x,y) ->
                                Long.compare(
                                        ChronoUnit.YEARS.between(x.joiningDate, x.relivingDate),
                                        ChronoUnit.YEARS.between(y.joiningDate, y.relivingDate)
                                )
                        )
                ).map(e -> e.getName() + " - " +  ChronoUnit.YEARS.between(e.joiningDate, e.relivingDate))
                .orElse("No data");

        System.out.println(exp);
    }

    private static void avgServingDuration() {

        List<Long> expList = employeeList.stream()
                .map(x -> ChronoUnit.YEARS.between(x.joiningDate, x.relivingDate))
                .collect(Collectors.toList());

        Object ob = employeeList.stream()
                .collect(Collectors.averagingLong(
                        x -> ChronoUnit.YEARS.between(x.joiningDate, x.relivingDate)
                ));

        System.out.println(expList);
        System.out.println(ob);
    }

    private static void groupByJoinYear() {
        Map<Integer, String> joinGroup = employeeList.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getJoiningDate().getYear(),
                        Collectors.mapping(
                                emp -> emp.getName(),
                                Collectors.joining(",","[","]")
                        )
                ));

        joinGroup.forEach((k,v)-> System.out.println(k + " => " + v));
    }

    private static void findSeniorByDept() {
        Map<String, String> seniorByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment(),
                        Collectors.collectingAndThen(
                            Collectors.maxBy(
                                    (x,y) ->
                                            Long.compare(
                                                    ChronoUnit.YEARS.between(x.joiningDate, x.relivingDate),
                                                    ChronoUnit.YEARS.between(y.joiningDate, y.relivingDate)
                                            )
                            ),
                            opt -> opt.map(e ->
                                            e.getName() + " - " + ChronoUnit.YEARS.between(e.joiningDate, e.relivingDate))
                                    .orElse("No employee")
                                )
                ));

        seniorByDept.forEach((k,v)-> System.out.println(k + " => " + v));
    }

    private static void sortByDuration() {
//        List<String> duration = employeeList.stream()
//                .sorted((x,y) -> Long.compare(
//                        ChronoUnit.MONTHS.between(x.joiningDate, x.relivingDate),
//                        ChronoUnit.MONTHS.between(y.joiningDate, y.relivingDate)
//                ))
//                .collect(Collectors.mapping(
//                        emp -> ChronoUnit.YEARS.between(emp.joiningDate, emp.relivingDate) + " - " + emp.getName(),
//                                Collectors.toList()
//                ));

//        duration.forEach(System.out::println);

        Map<Long, String> keyValue = employeeList.stream()
                .sorted((x,y) -> Long.compare(
                        ChronoUnit.MONTHS.between(x.joiningDate, x.relivingDate),
                        ChronoUnit.MONTHS.between(y.joiningDate, y.relivingDate)
                ))
                .collect(
                        Collectors.toMap(e -> ChronoUnit.YEARS.between(e.getJoiningDate(), e.getRelivingDate()),
                                e -> e.getName(),
                                (oldVal, newVal) -> oldVal + " - " + newVal)
                );
        keyValue.forEach((k,v)-> System.out.println(k + " => " + v));
    }

    private static void sortByJoiningYear() {
//        List<String> joinDate = employeeList.stream()
//                .sorted((x,y) -> x.joiningDate.compareTo(y.joiningDate))
//                .collect(Collectors.mapping(
//                        emp -> emp.joiningDate + " - " + emp.getName(),
////                        Collectors.toList()
//                        Collectors.toCollection( () -> new ArrayList<>())
//                ));

        List<String> joinDate = employeeList.stream()
                .sorted((x, y) -> x.joiningDate.compareTo(y.joiningDate))
                .map(emp -> emp.joiningDate + " - " + emp.getName())
                .collect(Collectors.toCollection(() -> new ArrayList<>()));

        joinDate.forEach(System.out::println);
    }

    private static void sortByRelivingYear() {
        List<String> joinDate = employeeList.stream()
                .sorted((x,y) -> x.relivingDate.compareTo(y.relivingDate))
                .collect(Collectors.mapping(
                        emp -> emp.relivingDate + " - " + emp.getName(),
                        Collectors.toList()
                ));

        joinDate.forEach(System.out::println);
    }

    public static void main(String[] args) {
        addEmployee();
//        groupByExp();

//        longExp();
//        avgServingDuration();
//        groupByJoinYear();
//        findSeniorByDept();
        sortByDuration();
//        sortByJoiningYear();
//        sortByRelivingYear();

    }
}