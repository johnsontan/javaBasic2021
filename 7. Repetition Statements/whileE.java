class whileE{
    public static void main(String args[]){

        int n = 16; // a perfect square
        int x = 1;

        // the while loop will break once the condition is false
        while(x*x < n){
            System.out.println(x);
            x++;
        }
        
        // print out a message and variable x
        System.out.println("exit while loop");
        System.out.println(x);
    }
}