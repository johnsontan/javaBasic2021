class doWhileE {
    public static void main(String args[]){

        int n = 16;  // a perfect square
        int x = 0;

        do{
            x++;
        }while(x*x != n); // the loop breaks if the condition is false
        
        // print out a message and variable x
        System.out.println("exit do..while loop");
        System.out.println(x);
    }
}
