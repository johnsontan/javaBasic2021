public class enumE{

    // instantiate an enum variable 
    public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
    public static void main(String args[]){

        // loop through Day and prints it out using enchanced for loop
        for (Day today : Day.values()) {
            System.out.println(today);
        }

        // assign single values 
        Day day0 = Day.MONDAY;
        Day day1 = Day.TUESDAY;
        // print out single values 
        System.out.println("Single value of day0: " + day0);
        System.out.println("Single value of day1: " + day1);
    }
}