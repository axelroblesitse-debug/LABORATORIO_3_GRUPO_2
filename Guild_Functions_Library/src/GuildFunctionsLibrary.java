import java.util.Scanner;

public class GuildFunctionsLibrary {

    // Método para validar que no haya números negativos
    public static boolean hasNegative(double[] numbers) {
        for (double num : numbers) {
            if (num < 0) {
                return true;
            }
        }
        return false;
    }

    public static double sum(double[] numbers) {
        double total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

    public static double average(double[] numbers) {
        return sum(numbers) / numbers.length;
    }

    public static double max(double[] numbers) {
        double maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        return maxValue;
    }

    public static double min(double[] numbers) {
        double minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        return minValue;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar?: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        // Ingreso de datos con validación
        for (int i = 0; i < size; i++) {
            double value;

            do {
                System.out.print("Ingresa el número #" + (i + 1) + ": ");
                value = scanner.nextDouble();

                if (value < 0) {
                    System.out.println("No se permiten números negativos. Intenta otra vez.");
                }

            } while (value < 0);

            numbers[i] = value;
        }

        // Validación adicional (por si acaso)
        if (hasNegative(numbers)) {
            System.out.println("Error: Hay números negativos en la lista.");
        } else {
            System.out.println("Suma: " + sum(numbers));
            System.out.println("Promedio: " + average(numbers));
            System.out.println("Máximo: " + max(numbers));
            System.out.println("Mínimo: " + min(numbers));
        }

        scanner.close();
    }
}
 

