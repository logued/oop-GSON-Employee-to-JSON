package dkit.oop;

class Employee {

    // Member variables of this class
    private String id;
    private String name;
    private String department;
    private int rating;
    private double salary;

    public Employee(String id, String name, String department, int rating, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.rating = rating;
        this.salary = salary;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }

    public void setDepartment(String department)
    {
        this.department = department;
    }
    public int getRating() { return rating; }
    public void setRating(int rating)
    {
        this.rating = rating;
    }
    public double getSalary() { return salary; }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override public String toString()
    {
        return "Employee [id=" + id + ", name=" + name
                + ", department=" + department + ", rating="
                + rating + ", salary=" + salary + "]";
    }
}
