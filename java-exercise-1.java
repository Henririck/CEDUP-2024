import java.util.Scanner;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        int num = entrada.nextInt();

        System.out.println("o numero antecessor é: " + (num - 1));
        System.out.println("o numero sucessor é: " + (num + 1));
    }
}