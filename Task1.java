public class Task1 {

    public static void main(String[] args) {
        System.out.println("Максимально число из трех целых: " + getMaxInt(7, 8, 11));

        System.out.println("Максимально число из трех плавающих: " + getMaxDouble(27.11, 18.9, 18.2));
    }
    
    public static int getMaxInt(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static double getMaxDouble(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}