public class Main {
    public static void main(String[] args) {


        int numMin = 0;
        int numMax = 5;
        System.out.printf("Сумма чисел от %d до %d равна %d\n", numMin, numMax, sumRange(numMin, numMax));

        numMin = -8;
        numMax = 8;
        System.out.printf("Сумма чисел от %d до %d равна %d\n", numMin, numMax, sumRange(numMin, numMax));

        int numSome1 = 4;
        int numSome2 = 5;
        System.out.printf("'%s' + '%s' = '%s'\n", numSome1, numSome2, add(numSome1, numSome2));

        String part1 = "Паро";
        String part2 = "ход";
        System.out.printf("'%s' + '%s' = '%s'\n", part1, part2, add(part1, part2));

        int[] numArray = {1, -4, 5};
        System.out.printf("Max = %d\n", getMax(numArray));

        int factorialNum = 10;
        System.out.printf("%d! = %d\n", factorialNum, getFactorial(factorialNum));

        double circleRadius = 18.5;
        System.out.printf("Площадь круга с радиусом %.2f равна %.2f\n", circleRadius, calculateArea(circleRadius));

        double size1 = 10;
        double size2 = 20;
        System.out.printf("Площадь прямоугольника со сторонами %.2f и %.2f равна %.2f\n", size1, size2, calculateArea(size1, size2));

        int[] numList = new int[] {1, 2, 3, 11};
        System.out.printf("Среднее арифметическое - %.5f\n", getAverage(numList));

        double side1 = 4;
        double side2 = 3;
        System.out.printf("Гипотенуза прямоугольного треугольника с катетами %.2f и %.2f равна %.2f", side1, side2, calculateHypotenuse(side1, side2));
    };

    /**
     * 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
     *    и возвращает сумму всех чисел между ними (включительно)
     */
    public static int sumRange(int min, int max) {
        int result = 0;
        for (int i = min; i <= max ; i++) {
            result += i;
        }
        return result;
    }

    /**
     * 2. Создайте два перегруженных метода add:
     *    Первый складывает два целых числа;
     *    Второй складывает две строки.
     */
    public static int add(int num1, int num2) {
         return (num1 + num2);
    }

    public static String add(String str1, String str2) {
        return str1.concat(str2);
    }

    /**
     * 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
     */
    public static int getMax(int ...nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result < nums[i]) {
                result = nums[i];
            }
        }
        return result;
    }

    /**
     * 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
     */
    public static int getFactorial(int num){
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус);
     *    Для прямоугольника (принимает длину и ширину).
     */
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
    /**
     * 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
     */
    public static double getAverage(int ...nums) {
        double sum = 0;
        for (int it : nums) {
           sum += it;
        }
        return (sum/nums.length);
    }

    /**
     * 7. Напишите метод, который принимает два числа, представляющие длины катетов,
     *    и возвращает длину гипотенузы (используйте теорему Пифагора)
     */
    public static double calculateHypotenuse(double leg1, double leg2) {
        return Math.sqrt(Math.pow(leg1,2) + Math.pow(leg2,2));
    }

}