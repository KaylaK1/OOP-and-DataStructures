public class Arrays_ArrayLists {
    

    public static void main(String args[])
    {
        // Declare arrays
        // type_of_array[] reference_variable = new element_type[length];
        // declaring an array reference_variable = initialize the variable with the array element type.

        double[] values = new double[10];

        // This created an array with 10 elements who's index spans from 0 to 9. Or length - 1.
        // Attempting to access an element outside of the range is a bounds error.
        // Bounds Error occurs at run-time. It causes a run-time exception.

        // Example:
        // values[10] = value; 
        // Causes an out of bounds error. Instantiating a new double[10] means 10 elements index 0-9. 


        // its a good idea to use a named constant instead of a magic number:
        final int LENGTH = 10;


        // Use the expression array.length to find the number of elements in an array. 
        for (int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }

        // To ensure that you only access the array when the index variable i is within the legal bounds:
        int value = 2;
        int i = 2;
        if (0 <= i && i < values.length) { values[i] = value;}

        // Recall that an array reference specifies the location of the array in memory. So copying the reference still
        // refers to the same array. 

        
    }
}
