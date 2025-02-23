public class AreaCalculator {
     public static void main(String[] args) {
         System.out.println("Calculadora de área para diferentes figuras.");
     }
     public static double circleArea(double radius) {
         return Math.PI * radius * radius;
     }
    public static double triangleArea(double base, double height) {
         return (base * height) / 2;
    }
}
