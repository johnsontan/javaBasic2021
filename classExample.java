class classExample{

    public static void main(String args[]){
        // instantiate 3 variables from the class HelloWorldApp
        HelloWorldApp hiInChinese = new HelloWorldApp("Nin Hao");
        HelloWorldApp hiInFrench = new HelloWorldApp("Bonjour");
        HelloWorldApp hiInJapanese = new HelloWorldApp("Konnichiwa");

        // printing all 3 variables using getString() function
        System.out.println("Printing all objects..");
        System.out.println(hiInChinese.getString());
        System.out.println(hiInFrench.getString());
        System.out.println(hiInJapanese.getString());

        // printing satic variable in the call HelloWorldApp
        System.out.println("Printing static variable..");
        System.out.println(HelloWorldApp.getStaticString());

    }
}

class HelloWorldApp{
    // instantiate 2 private variables, defaultString varaible is static
    private String stringToPrint;
    private static String defaultString = "Static string - default string";

    // function to assign value to stringToPrint
    public HelloWorldApp(String input){
        this.stringToPrint = input;
    }

    // function to output stringToPrint value
    public String getString(){
        return this.stringToPrint;
    }

    // function to output defaultString
    public static String getStaticString(){
        return defaultString;
    }
}
