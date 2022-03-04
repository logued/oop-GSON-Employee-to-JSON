package dkit.oop;

import com.google.gson.Gson;

/**
 * GSON Sample  - Employee to JSON
 */
public class AppMainGSON
{
    public static void main(String[] args) {
        System.out.println("GSON Example");
        AppMainGSON app = new AppMainGSON();
        app.start();
    }

    public void start() {
        // Creating an object of Gson class
        Gson gsonParser = new Gson();
        // Creating an object of Employee class
        Employee emp = new Employee("John","E00101","IT",7,250000.00);

        // Generating a json string from an employee object
        String empJsonString = gsonParser.toJson(emp);
        System.out.println("Emp json is " + empJsonString);

        // Changing one of the attributes of the employee object
        emp.setDepartment("Java");
        empJsonString = gsonParser.toJson(emp);
        // Generating an Employee object from an employee json String
        Employee emp2 = gsonParser.fromJson( empJsonString, Employee.class );

        // Print and display the employee
        System.out.println("Employee generated from json is: \n"+ emp2);
    }
}
