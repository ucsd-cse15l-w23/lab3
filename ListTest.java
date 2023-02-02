import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class ListTest {
    @Test
    public void testMerge(){
        List<String> l1 = new ArrayList<String>(Arrays.asList("a", "c"));
        List<String> l2 = new ArrayList<String>(Arrays.asList("b", "d"));
        List<String> m = ListExamples.merge(l1, l2);
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, m.toArray());

    }
}
