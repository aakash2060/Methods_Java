import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMethodAssignment {

   @Test
   public void testLowest()
   {
     int[] array = {1, 2, 3};
     // assertion
     assertEquals(1, MethodAssignment.lowest(array));
     array = new int[]{1, 2, 3, 4, 5, 6, -1};
     assertEquals(-1, MethodAssignment.lowest(array));
   }
   @Test
   public void testHighest()
   {
     int[] array = {1, 2, 3};
     // assertion
     assertEquals(3, MethodAssignment.highest(array));
     array = new int[]{1, 2, 3, 4, 5, 6, -1};
     assertEquals(6, MethodAssignment.highest(array));
   }

   @Test
   public void testCalculateAverage()
   {
     int[] array = {1, 2, 3};
     // assertion
     assertEquals(2.0, MethodAssignment.calculateAverage(array));
     array = new int[]{1, 2, 3, 4, 5, 6, 0};
     assertEquals(3.0, MethodAssignment.calculateAverage(array));
   }
}