public class incrementE{
    public static void main(String args[]){
        int sum = 10;

        //expression 1
        int e1 = 5;
        e1++;
        System.out.println(e1);

        //expression 2 
        int e2 = 5;
        e2++;
        System.out.println(e2);

        //expression 3
        int counter = 5;
        System.out.println("Sum + counter++: " + (sum + counter++));

        //expression 4
        System.out.println("++Counter + sum: " + (++counter + sum));
    }
}