import java.util.Scanner;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        double C = entrada.nextDouble();

        double F = C * 1.8 + 32;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahenrite é: " + (C + F));
        System.out.println("A temperatura em Kelvin é: " + (C + K));
        System.out.println("A temperatura em Re é: " + (C + Re));
        System.out.println("A temperatura em Ra é: " + (C + Ra));
    }
}
