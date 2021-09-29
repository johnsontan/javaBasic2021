// import random function in Java 
import java.util.Random;

class coinSlip {
    
    public static void main(String args[]){
        // random a number
        Random rand = new Random();

        // instantiate a random variable between 0.0 to 1.0
        double x = rand.nextDouble();
        
        if(x < 0.5)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }
}
