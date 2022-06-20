package by.holikov.javaIntroduction.algorithmization.decomposition;

//    Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//    треугольника.

public class HexagonArea {

    public static void main(String[] args) {

    double hexagonArea;
    int a = 2;

       try {
            hexagonArea = hexagonArea(a);
            System.out.printf("Hexagon area = %.4f%n", hexagonArea);

        }
        catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static double triangleArea(int side) {
        double area=0;
        if (side <= 0) {
            throw new IllegalArgumentException("Numbers must be natural!");
        }
        area = Math.sqrt(3)/4 * side*side;

        return area;
    }

    private static double hexagonArea(int side) {

        double result = 0;

        if (side <= 0) {
            throw new IllegalArgumentException("Numbers must be natural!");
        }

        result = 6 * triangleArea(side);

    return result;
    }

}