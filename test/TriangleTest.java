import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("case 2-2-2")
    public void testa2b2c2(){
        int a=2;
        int b=2;
        int c=2;
        String expected= "Tam giác đều";
        String result = Triangle.triangleClassification(a,b,c);
        assertEquals(expected,result);
    }
}