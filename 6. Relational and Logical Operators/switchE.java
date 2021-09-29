// import random function in java
import java.util.Random;

class switchE {
    
    public static void main(String args[]){
        // instantiate a random variable 
        Random rand = new Random();
        // randomize an integer from 0 to 7
        int day = rand.nextInt(8);

        switch(day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break; 
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
