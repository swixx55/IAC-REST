package restservice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Roy on 23-6-2017.
 */
public class BMITest {
    double DELTA = 1e-15;
    @Test
    public void geldigeInput() {
    BMI w = new BMI();
    double result = w.getBmi(10, 12);
    assertEquals(120, result, DELTA);
    }
}
