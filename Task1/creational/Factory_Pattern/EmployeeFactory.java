public class EmployeeFactory {
    // get the employee
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("ANDROID")) {
            return new AndroidDeveloper();
        } 
        else if (empType.trim().equalsIgnoreCase("WEB")) {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
