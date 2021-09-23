/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TheSumOfSameElementsAndCompareANumber;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {

    @Test
    public void testSumIsLessThanNumber() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
       ArrayList<Integer> arrayTwo = new ArrayList<>(Arrays.asList(1, 2, 3));
       ArrayList<Integer> arrayThree = new ArrayList<>(Arrays.asList(1, 2));
       int count = App.sumOfSameElements(array, arrayTwo, arrayThree);
       assertTrue(App.compare(count, 5));
    
     }

     @Test
    public void testSumIsEqualNumber() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
       ArrayList<Integer> arrayTwo = new ArrayList<>(Arrays.asList(1, 2, 3));
       ArrayList<Integer> arrayThree = new ArrayList<>(Arrays.asList(1, 2));
       int count = App.sumOfSameElements(array, arrayTwo, arrayThree);
       assertFalse(App.compare(count, 3));
    
     }

     @Test
     public void testSumIsGreaterThanNumber() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arrayTwo = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arrayThree = new ArrayList<>(Arrays.asList(1, 2));
        int count = App.sumOfSameElements(array, arrayTwo, arrayThree);
        assertFalse(App.compare(count, 2));
     
      }
 
     @Test
     public void testTheSumOfDifferentArraysLessThanNumber() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
       ArrayList<Integer> arrayTwo = new ArrayList<>(Arrays.asList(6, 7, 8));
       ArrayList<Integer> arrayThree = new ArrayList<>(Arrays.asList(10));
       int count = App.sumOfSameElements(array, arrayTwo, arrayThree);
       assertTrue(App.compare(count, 11));
     }
 
     @Test
     public void testEmptyArrays() {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayTwo = new ArrayList<>();
        ArrayList<Integer> arrayThree = new ArrayList<>();
        int count = App.sumOfSameElements(array, arrayTwo, arrayThree);
        assertTrue(App.compare(count, 5));
     }
 
     @Test
     public void testNullArrays() {
        int count = App.sumOfSameElements(null, null, null);
        assertTrue(App.compare(count, 5));
     }
 
}
