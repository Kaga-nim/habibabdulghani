import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Konversi Suhu");
        System.out.println("=================");

        System.out.print("Celcius = ");
        double celcius = input.nextDouble();

        double reamur = (4.0 / 5.0) * celcius;
        double fahrenheit = (9.0 / 5.0) * celcius + 32;
        double kelvin = celcius + 273.15;

        System.out.println("Reamur = " + reamur);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Kelvin = " + kelvin);

        input.close();
    }
}
