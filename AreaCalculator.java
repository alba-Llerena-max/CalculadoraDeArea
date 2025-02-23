public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
        
        // Ejemplo de uso
        double triangle = triangleArea(3, 8);
        
        System.out.println("Área del triángulo: " + triangle);
    }
    
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
