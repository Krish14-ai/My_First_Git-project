public class arrays{
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Calculate and print the sum of the array elements
        // it's time complexity is O(n)
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
          // To find the mean of the array elements
       double mean = (double) sum / numbers.length;
       System.out.println("Mean of array elements: " + mean);

       // find the maximum value in the array
       // it's time complexity is O(n)
       int max = 0;
       for(int i = 0; i<numbers.length-1; i++){
        if(numbers[i]>numbers[i+1]){
            max = numbers[i];
        }
        else if(numbers[i]<numbers[i+1]){
            max = numbers[i+1];
        }
        else{
            max = numbers[i];
        }
       }
       System.out.println("Maximum value in the array: " + max);

       // we use the the same process to find the minimum value in the array
       // it's time complexity is also O(n)
       int min = -1;
       for(int i = 0; i < numbers.length -1; i++){
        if(numbers[i] < numbers[i+1]){
            min = numbers[i];
        }
        else if(numbers[i]>numbers[i+1]){
            min = numbers[i+1];
        }
        else{
            min = numbers[i];
        }
        System.out.println("Minimum value in the array: " + min);
       }
    }}