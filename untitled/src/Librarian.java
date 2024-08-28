class Librarian extends Person
{
    private int employeeId;

    public Librarian(String name, String adders, int employeeId)
    {
        super(name, adders);
        this.employeeId = employeeId;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    @Override
    public void displayInfo()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAdders());
    }
}
