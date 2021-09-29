class constantE {
    
    public static void main(String args[]){
         // create 2 objects from class example
         example obj1 = new example();
         example obj2 = new example();
        
         // print and useA the values in obj1
        System.out.println("print Object1");
        obj1.printThis();
        System.out.println("Object1 using value a to add 2.0");
        obj1.useA(2.0);

        // print and useA the values in obj2
        System.out.println("print Object2");
        obj2.printThis();
        System.out.println("Object2 using value a to add 3.0");
        obj2.useA(3.0);

    }
}

class example{
    // instantiate constant private variable 
    final private double a = 1.0;
    
    // function to add variable a and b and prints it
    public void useA(double b){
        System.out.println(a+b);
    }

    // function to print constant private variable a
    public void printThis(){
        System.out.println(a);
    }
}