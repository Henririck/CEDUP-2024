import java.util.Scanner;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("brabo ");
        int num = entrada.nextInt();
        double result = num * 0.01;

        System.out.println("o resultado é " + (result + num));
    }
}