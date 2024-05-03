import java.util.Scanner;

public class CRC32Calculator {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos
        System.out.print("Ingrese los datos para calcular el CRC-32: ");
        String data = scanner.nextLine();

        // Crear un objeto CRC32Calculator
        MyCRC32 crcCalculator = new MyCRC32();

        // Calcular el CRC-32
        long crc32Value = crcCalculator.calculateCRC32(data);

        // Mostrar el resultado
        System.out.println("CRC-32 de \"" + data + "\" es: " + crc32Value);

        // Cerrar el Scanner
        scanner.close();
    }
}

