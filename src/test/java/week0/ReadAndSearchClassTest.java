package week0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import week0.initialtasks.ReadAndSearchClass;

public class ReadAndSearchClassTest {

    ReadAndSearchClass readAndSearchClass = new ReadAndSearchClass();
    String filePath = "src/main/resources/file.txt";

    @Test
    void findLongestSequenceSuccess() {

        List<Integer> expectedList = Arrays.asList(1, 2, 3, 2, 7, 11, 44, 100, 3, 8, 8, 6, 10, 3);
        int expectedLength = 5;
        assertEquals(expectedLength, readAndSearchClass.findLongestSequence(filePath));


    }
}
