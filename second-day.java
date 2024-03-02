import java.util.Scanner;
import javax.swing.JOptionPane;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        double num = entrada.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        double num1 = entrada2.nextInt();

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        double num2 = entrada3.nextInt();

        System.out.println("o numero antecessor é: " + (num1 + num + num2) / 3);

    }
}

class xuxa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um numero ");
        int num = entrada.nextInt();

        if (num >= 0) {
            System.out.println(num + " patinhos foram passear ");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quáMas só n-1 patinhos voltaram de lá.");
            System.out.println("Que se repete até nenhum patinho voltar de lá.");
            System.out.println("Ao final, todos os patinhos voltam:");
            System.out.println("A mamãe patinha foi procurar");
            System.out.println("Na beira do mar");
            System.out.println("Além das montanhas");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            System.out.println("E os n patinhos voltaram de lá.");
        } else {
            System.out.println("não é um numero inteiro");
        }
    }
}

class pi {
    public static void main(String[] args) {
        String pi = "3.1415";
        double numPi = Double.parseDouble(pi);
        float numPiFloat = Float.parseFloat(pi);

        System.out.println(numPi);
        System.out.println(numPiFloat);
    }
}

class exercise1 {
    public static void main(String[] args) {
        int nota1 = 2, nota2 = 4, nota4 = 5, nota5 = 3;

        System.out.println((nota1 + nota2 + nota4 + nota5) / 4);
    }
}

class exercise2 {
    public static void main(String[] args) {
        char let1 = 'H';
        char let2 = 'E';
        char let3 = 'N';
        char let4 = 'R';
        char let5 = 'I';

        String nomeCompleto = "" + let1 + let2 + let3 + let4 + let5;

        System.out.println(nomeCompleto);
    }
}

class exercise3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um nome: ");
        String nome = entrada.nextLine();

        System.out.println("Insira um sobrenome");
        String nome1 = entrada.nextLine();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("insira um parâmetro: ");
        double B = entrada2.nextDouble();

        System.out.println("Insira um parâmetro");
        double A = entrada2.nextDouble();

        String conca = "" + nome + nome1;
        double conca1 = A + B;

        System.out.println(conca);
        System.out.println(conca1);
    }
}