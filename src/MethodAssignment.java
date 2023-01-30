import java.util.Arrays;

public class MethodAssignment {
    public static void main(final String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int lowestValue=lowest(array);
        int highestValue=highest(array);
        double resultAverage=calculateAverage(array);

        System.out.println("The elements of the array are : " + Arrays.toString(array));

        System.out.println("The lowest is: " + lowestValue);
      System.out.println("The highest is: " + highestValue);
		System.out.println("The average is: " + resultAverage);
    }

    static int lowest(int[] input1) {
         int small= input1[0];

        for (int i = 0; i < input1.length; i++) {
            if (input1[i]< small) {
                small = input1[i];
            }
        }
        return small;
    }

    public static int highest(int[] input2) {
        int big= input2[0];
		for(int i=0; i<input2.length;i++){
            if(big<input2[i]){
                input2[i]=big;
            }
        }
        return big;
	}
	static double calculateAverage(int[] input3) {
        double sum = 0;
        for(int i:input3){
        sum+=i;
        }
     return sum/input3.length;
      }

}