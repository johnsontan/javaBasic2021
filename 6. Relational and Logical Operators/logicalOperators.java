class logicalOperators {
    
    public static void main (String args[]){
        // Conditional AND &&
        if(true && true)
            System.out.println("Conditional AND (True and True)");
        

        // Conditional OR
        if(true || false)
            System.out.println("Conditional OR (True OR False)");
        

        // Boolean logical exclusive OR ^
        boolean exclusiveOR = true ^ false;
        System.out.println("Boolean logical exclusive OR (true ^ false): " + exclusiveOR);

        // logical NOT !
        if(!false)
            System.out.println("!false = true");
        
    }
}
