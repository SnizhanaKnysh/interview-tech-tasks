import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ReadAndSearchClassTest {
    ReadAndSearchClass readAndSearchClass = new ReadAndSearchClass();

    @Test
    void testReadFileSuccess() {

        readAndSearchClass.readFile();
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 2, 7, 11, 44, 100, 3, 8, 8, 6, 10, 3);
        assertEquals(expectedList, readAndSearchClass.list);

    }

    @Test
    void testSearchLongestSequenceSuccess() {
        readAndSearchClass.readFile();
        int expectedResult = 5;
        assertEquals(expectedResult, readAndSearchClass.searchLongestSequence(readAndSearchClass.list));
    }



}
