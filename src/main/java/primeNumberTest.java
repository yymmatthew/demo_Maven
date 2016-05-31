import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by YYM-M on 5/29/16.
 */
public class primeNumberTest {


    @Test
    public void should_() {
        //given
        //When
        //Then
        assertEquals(Arrays.asList(2),primateNumber.clc(2));
        assertEquals(Arrays.asList(3),primateNumber.clc(3));
        assertEquals(Arrays.asList(2,2),primateNumber.clc(4));
        assertEquals(Arrays.asList(5),primateNumber.clc(5));
        assertEquals(Arrays.asList(2,3),primateNumber.clc(6));
        assertEquals(Arrays.asList(7),primateNumber.clc(7));
        assertEquals(Arrays.asList(2,2,2),primateNumber.clc(8));
        assertEquals(Arrays.asList(3,3),primateNumber.clc(9));
        assertEquals(Arrays.asList(3,3,5,5,7,11,13),primateNumber.clc(3*3*5*5*7*11*13));

    }
}
