import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceNums(){
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
  }

  @Test
  public void testReversedNums(){
    int[] input2 = {1, 2, 3};
    int[] arr = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{3, 2, 1}, arr);
  }

  @Test
  public void testAverageWithMultipleLowest(){
    double[] input2 = {1.0, 1.0, 2.0, 3.0};
    double avg = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(2.0, avg, 0);
  }

  @Test
  public void testAverageWithUniqueLowest(){
    double[] input2 = {1.0, 2.0, 3.0};
    double avg = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(2.5, avg, 0);
  }
}
