class identicalNamesE{

    // class level scope variable 
    private static int number = 5;
    public static void main(String args[]){
        // method level scope variable 
        int number = 99;
    
        System.out.println(number);
    }
}