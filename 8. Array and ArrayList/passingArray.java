class passingArray {
    
    // main creates array and calls modifyArray and modifyElement
    public static void main (String args[]){
        // instantiate an integer array with 5 elements
        int[] array = {1,2,3,4,5};

        System.out.printf("Effect of passing reference to entire array%n" +
                        "The values of the original array are: %n");

        // output original array elements
        for(int value: array)
            System.out.printf("     %d", value);
        
        System.out.printf("%n%nThe values of the modified array are: %n");

        // passing the array into the method
        modifyArray(array);

        // output the modified array
        for(int value: array)
            System.out.printf("     %d", value);

        // output array index 3
        System.out.printf("%n%nEffects of passing array element value:%n"+
                        "array[3] before midifyElement: %d%n", array[3]);
        
        // passing the array into the method
        modifyElement(array[3]);
        
        // output array index 3
        System.out.printf("array[3] after modifyElement: %d%n",array[3]);
    }

    public static void modifyArray(int[] array2){
        for(int counter = 0; counter < array2.length; counter++)
            array2[counter] *= 2;
    }

    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }
}
