public class inheritance {
    public static void main(String argsp[]){
        
        // instantiate a new variable from the class laptop
        laptop macbook = new laptop(3.3, "pro");
        // print out the values using toString function 
        System.out.println(macbook);
    }
}

// parent class
class processor{
    private Double clockSpeed;

    // constructor 
    public processor(Double clockSpeed){
        this.clockSpeed = clockSpeed;
    }
    
    // function to get clockSpeed value
    public Double getSpeed(){
        return this.clockSpeed;
    }
}

// child class extends to parent class
class laptop extends processor{
    private String model;

    // constructor with parent class constructor 
    public laptop(Double clockSpeed, String model){
        super(clockSpeed);
        this.model = model;
    }

    // function to get model and clockSpeed values
    public String toString(){
        return this.model + " => " + this.getSpeed();
    }
}


