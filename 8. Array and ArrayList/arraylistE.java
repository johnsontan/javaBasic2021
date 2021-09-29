import java.util.ArrayList;
class arraylistE {
    
    public static void main(String args[]){
        // instantiate ArrayList String variable 
        ArrayList<String> cryptocurrency = new ArrayList<String>();

        // add function
        cryptocurrency.add("BTC");
        cryptocurrency.add("ETH");
        cryptocurrency.add("DOT");
        cryptocurrency.add("ADA");

        // access an item
        System.out.println(cryptocurrency.get(2)); // output: DOT

        // change an item
        cryptocurrency.set(0, "WBTC");
        System.out.println(cryptocurrency.get(0));

        // remove an item
        System.out.println("Array length before remove: " + cryptocurrency.size());
        cryptocurrency.remove(3);
        System.out.println("Array length after remove: " + cryptocurrency.size());
        
        // clear all the elements in the array
        cryptocurrency.clear();
    }
}
