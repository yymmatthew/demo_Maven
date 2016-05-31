import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YYM-M on 5/29/16.
 */
public class TennisTest {
    @Test
    public void should_() {
        //given
        //When
        //Then
        assertEquals("Love All",Tennis.score(0,0));
        assertEquals("Fifteen All",Tennis.score(1,1));
        assertEquals("Thirty All",Tennis.score(2,2));
        assertEquals("Fifteen Love",Tennis.score(1,0));
        assertEquals("Thirty Love",Tennis.score(2,0));
        assertEquals("Fourty Love",Tennis.score(3,0));
        assertEquals("Love Fifteen",Tennis.score(0,1));
        assertEquals("Love Fourty",Tennis.score(0,3));
        assertEquals("Deuce",Tennis.score(3,3));
        assertEquals("Deuce",Tennis.score(4,4));
        assertEquals("Fourty Fifteen",Tennis.score(3,1));
        assertEquals("Fourty Thirty",Tennis.score(3,2));
        assertEquals("Thirty Fourty",Tennis.score(2,3));
        assertEquals("Fifteen Fourty",Tennis.score(1,3));
        assertEquals("A win",Tennis.score(4,0));
        assertEquals("A win",Tennis.score(4,2));
        assertEquals("A win",Tennis.score(5,3));
        assertEquals("B win",Tennis.score(0,4));
        assertEquals("A Advantage",Tennis.score(4,3));
        assertEquals("A Advantage",Tennis.score(5,4));
        assertEquals("B Advantage",Tennis.score(3,4));
        assertEquals("B Advantage",Tennis.score(4,5));



    }


}
