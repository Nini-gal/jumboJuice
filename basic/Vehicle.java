class Vehicle {
    private String name;
    private String plateNo;
    private char category;

    public char thePlate(){
        //return the first character of the plate number
        return plateNo.charAt(0);
    }

    //storer methods
    public Vehicle(String name, String plateNo, char category){
        this.name = name;
        this.plateNo = plateNo;
        this.category = category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPlateNo(String plateNo){
        this.plateNo = plateNo;
    }

    //S - staff, P - student, V - visitor

    public void setCategory(char category){
        this.category = category;
    }

    //retriever methods

    public String getName(){
        return name;
    }

    public String getPlateNo(){
        return plateNo;
    }

    public char getCategory(){
        return category;
    }
}
