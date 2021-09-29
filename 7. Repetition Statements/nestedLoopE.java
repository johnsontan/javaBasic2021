class nestedLoopE {
    public static void main(String args[]){

        // nested for loop 
        // outer for lopp iterates 10 times
        for (int i = 1; i < 10; i++){
            // inner for loop iterates i number of times 
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
