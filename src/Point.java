public class Point {

    private double x;
    private double y;
    private double z;

    // Конструктор для создания точки с заданными координатами
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Конструктор по умолчанию (позиция (0.0, 0.0, 0.0))
    public Point() {
        this(0.0, 0.0, 0.0);
    }

    /*ГЕТТЕРЫ*/
    public double getX() {return x;}
    public double getY() {return y;}
    public double getZ() {return z;}

    /*СЕТТЕРЫ*/
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setZ(double z) {this.z = z;}

    // Метод для сравнения двух точек на равенство
    @Override // Переопределение
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0 &&
                Double.compare(point.z, z) == 0;
    }

    // Метод для вычисления расстояния до другой точки
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) +
                Math.pow(other.y - this.y, 2) +
                Math.pow(other.z - this.z, 2));
    }

    // Метод для получения строкового представления точки
    @Override
    public String toString() {
        return String.format("Point(%.2f, %.2f, %.2f)", x, y, z);
    }
}
