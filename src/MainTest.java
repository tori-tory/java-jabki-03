import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MainTest {

    @Test
    public void sumRange() {
        int min = 4;
        int max = 6;
        Assertions.assertEquals((4 + 5 + 6), Main.sumRange(min, max));
    }

    @Test
    public void add() {
        int num1 = 5;
        int num2 = 6;
        Assertions.assertEquals((num1 + num2), Main.add(num1, num2));

        String str1 = "круго";
        String str2 = "ворот";
        Assertions.assertEquals("круговорот", Main.add(str1, str2));
    }

    @Test
    public void getMax() {
        int arrayMax[] = {-2, -3, 0};
        Assertions.assertEquals(0,Main.getMax(arrayMax));
    }

    @Test
    public void getFactorial() {
        Assertions.assertEquals((1 * 2 * 3 * 4 * 5), Main.getFactorial(5));
    }

    @Test
    public void calculateArea() {
        double r = 3;
        Assertions.assertEquals((Math.PI * r * r), Main.calculateArea(r));

        double a = 3;
        double b = 3;
        Assertions.assertEquals((a * b), Main.calculateArea(a, b));
    }

    @Test
    public void getAverage() {
        double average  = (20 + 30 + 30) * 1.0 / 3;
        Assertions.assertEquals(average, Main.getAverage(20, 30, 30));
    }

    @Test
    public void calculateHypotenuse() {
        Assertions.assertEquals(Math.sqrt((6 * 6) + (8 * 8)), Main.calculateHypotenuse(6, 8));
    }
}