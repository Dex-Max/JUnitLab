import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeBookTest {
    private GradeBook gradebook1;
    private GradeBook gradebook2;

    @Before
    public void setUp(){
        gradebook1 = new GradeBook(5);
        gradebook2 = new GradeBook(7);

        gradebook1.addScore(90);
        gradebook1.addScore(95);

        gradebook2.addScore(80);
        gradebook2.addScore(97);
    }

    @After
    public void tearDown(){
        gradebook1 = null;
        gradebook2 = null;
    }

    @Test
    public void addScoreTest(){
        assertTrue(gradebook1.toString().equals("90.0 95.0"));
        assertTrue(gradebook2.toString().equals("80.0 97.0"));

        assertEquals(2, gradebook1.getScoreSize());
        assertEquals(2, gradebook2.getScoreSize());
    }

    @Test
    public void sumTest(){
        assertEquals(90 + 95, gradebook1.sum(), 0.0001);
        assertEquals(80 + 97, gradebook2.sum(), 0.0001);
    }

    @Test
    public void minimumTest(){
        assertEquals(90, gradebook1.minimum(), 0.0001);
        assertEquals(80, gradebook2.minimum(), 0.0001);
    }

    @Test
    public void finalScoreTest(){
        assertEquals(95, gradebook1.finalScore(), 0.0001);
        assertEquals(97, gradebook2.finalScore(), 0.0001);
    }
}
