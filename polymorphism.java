public class polymorphism {
    public static void main(String args[]){

        // instantiate 4 variables based on the base class 
        printer myPrinter = new printer();
        printer printBnW = new bnw();
        printer printColor = new color();
        printer printGrayscale = new grayscale();

        // printing out all the vairables using printThis function
        System.out.println("Printing all objects..");
        myPrinter.printThis();
        printBnW.printThis();
        printColor.printThis();
        printGrayscale.printThis();
    }    
}

// base class
class printer{
    // function to print a string
    public void printThis(){
        System.out.println("3 types of options to print");
    }
}

// class extends to parent class 
class bnw extends printer{
    // function to print a string
    public void printThis(){
        System.out.println("Printing black and white..");
    }
}

// class extends to parent class
class color extends printer{
    // function to print a string
    public void printThis(){
        System.out.println("Printing color..");
    }
}

// class extends to parent class
class grayscale extends printer{
    // function to print a string
    public void printThis(){
        System.out.println("Printing grayscale..");
    }
}

