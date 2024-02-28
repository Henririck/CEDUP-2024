import java.util.Scanner;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o nome de um produto qualquer: ");
        String product = entrada.nextLine();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("informe o preço de custo de um produto qualquer: ");
        double num = entrada2.nextDouble();
        double result = num * 0.65;

        System.out.println("o nome do produto é " + product);
        System.out.println("o reajuste é " + (result + num));
    }
}