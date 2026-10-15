class PhoneBill{
    private String name;
    private String staffNo;
    private double salary;
    private int minutes;
    
    public PhoneBill(String name, String staffNo, double  salary, int minutes){
        this.name = name;
        this.staffNo = staffNo;
        this.salary = salary;
        this.minutes = minutes;
    }

    public void setNewSalary(double salary){
        //sets salary to a new salary
        this.salary = salary;
        System.out.println("New salary set to : " + salary);
    }

    public String getName(){
        return name;
    }

    public String getStaffNo(){
        return staffNo;
    }

    public double getSalary(){
        return salary;
    }

    public int getMinutes(){
        return minutes;
    }
}