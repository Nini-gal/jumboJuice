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

    double calcPhoneBill(){
        double bill = 0;
        if(minute <= 100){
            bill = minute * 0.20;
        }else if(minutes <= 250){
            bill = 100* 0.20 + (minute-100) * 0.35;
        }else{
            bill = 100* 0.20 + 150 * 0.35 + (minute - 250) * 0.15;
        }

    }

    void printInfo(){
        return "Name: " + name + "Staff Number: "+ staffNo + "Salary: RM" + salary + "Minutes : " +minutes + "Bill: " + calcPhoneBill();
    }

    public void setNewSalary(double salary){
        //sets salary to a new salary
        this.salary = salary;
        double newSalary = salary - bill;
        System.out.println("New salary set to : " + salary);
    }