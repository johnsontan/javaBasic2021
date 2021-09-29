class staticE {
    
    public static void main(String args[]){
        // instantiate 3 objects from class example
        example obj1 = new example();
        example obj2 = new example();
        example obj3 = new example();

        // print and modify the values in obj1
        System.out.println("print Object1");
        obj1.printThis();
        System.out.println("Object1 modifying value to 2.0");
        obj1.modify(2.0);

        // print and modify the values in obj2
        System.out.println("print Object2");
        obj2.printThis();
        System.out.println("Object2 modifying value to 3.0");
        obj2.modify(3.0);

        // print and modify the values in obj3
        System.out.println("print Object3");
        obj3.printThis();
        System.out.println("Object3 modifying value to 4.0");
        obj3.modify(4.0);
    }
}

class example{
    // instantiate private static variable 
    private static double a = 1.0;

    // function to overwirte the static vairable 
    public static void modify(double b){
        a = b;
    }

    // function to print the static variable 
    public static void printThis(){
        System.out.println(a);
    }
}
