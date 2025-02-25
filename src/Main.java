import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Point point1 = fillPoint();
        Point point2 = fillPoint();
        Point point3 = fillPoint();

        // Проверка на равенство точек
        if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
            System.out.println("Две из введенных точек совпадают. Площадь не будет вычислена.");
        } else {
            double area = calcArea(point1, point2, point3);
            // Проверка на существование треугольника
            if (area == 0) {
                System.out.println("Точки лежат на одной прямой. Треугольник не может существовать.");
            } else {
                System.out.printf("Площадь треугольника: %.2f%n", area);
            }
        }
    }

    // Метод для заполнения точки
    public static Point fillPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты точки (x, y, z): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        return new Point(x, y, z);
    }

    // Метод для вычисления площади треугольника
    public static double calcArea(Point p1, Point p2, Point p3) {
        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);

        // Полупериметр
        double s = (a + b + c) / 2;

        // Площадь по формуле Герона
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
