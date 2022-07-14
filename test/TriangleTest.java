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
    @Test
    @DisplayName("case 2-2-3")
    public void testa2b2c3(){
        int a=2;
        int b=2;
        int c=3;
        String expected= "Tam giác cân";
        String result = Triangle.triangleClassification(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 3-4-5")
    public void testa3b4c5(){
        int a=3;
        int b=4;
        int c=5;
        String expected= "Tam giác thường";
        String result = Triangle.triangleClassification(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 8-2-3")
    public void testa8b2c3(){
        int a=8;
        int b=2;
        int c=3;
        String expected= "Không phải là tam giác";
        String result = Triangle.triangleClassification(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case -1-2-1")
    public void testaNegative1b2c1(){
        int a=-1;
        int b=2;
        int c=1;
        String expected= "Không phải là tam giác";
        String result = Triangle.triangleClassification(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 0-1-1")
    public void testa0b1c1(){
        int a=0;
        int b=1;
        int c=1;
        String expected= "Không phải là tam giác";
        String result = Triangle.triangleClassification(a,b,c);
        assertEquals(expected,result);
    }
}