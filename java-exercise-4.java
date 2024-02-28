import java.util.Scanner;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número que você quer calcular: ");
        double numero = entrada.nextDouble();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite um número que você quer calcular: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Soma" + (numero + numero2));
        System.out.println("Subtração" + (numero + numero2));
        System.out.println("Multiplicação" + (numero * numero2));
        System.out.println("Divisão" + (numero / numero2));

    }
}