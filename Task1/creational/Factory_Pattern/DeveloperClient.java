public class DeveloperClient {
    public static void main(String[] args) {
        
        Employee emp1 = EmployeeFactory.getEmployee("ANDROID");
        System.out.println(emp1.salary());


        Employee emp2 = EmployeeFactory.getEmployee("WEB");
        System.out.println(emp2.salary());
    }
}
