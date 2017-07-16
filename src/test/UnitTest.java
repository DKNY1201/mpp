package test;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bi on 7/15/17.
 */
public class UnitTest {
    @Test
    public void TestSum() {
        int x = 1, y = 2;
        int expectResult = 3;

        assertEquals(expectResult, Util.sum2(x, y));
    }
}
