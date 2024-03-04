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
        int nota1 = 2, nota2 = 4, nota3 = 5, nota4 = 3;
        System.out.println((nota1 + nota2 + nota3 + nota4) / 4);
    }
}

class exercise2 {
    public static void main(String[] args) {
        char let1 = 'H', let2 = 'E', let3 = 'N', let4 = 'R', let5 = 'I';
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

        String conca = "" + nome + " " + nome1;
        double conca1 = A + B;

        System.out.println(conca);
        System.out.println(conca1);
    }
}

class desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um numero: ");
        int numero = entrada.nextInt();

        System.out.println("O seu sucessor é " + (numero + 1));
        System.out.println("O seu antecessorr é " + (numero - 1));
    }
}

class desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um valor: ");
        double numero = entrada.nextDouble();

        double valor = numero * 0.15;

        System.out.println("O valor com reajuste e " + (numero + valor));
    }
}

class desafio3 {
    public static void main(String[] args) {
        Scanner preco = new Scanner(System.in);
        System.out.println("Digite o preço");
        double numero = preco.nextDouble();

        Scanner nome = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome1 = nome.nextLine();

        double valor = numero * 0.85;
        System.out.println(nome1);
        System.out.println("o valor é " + (valor + numero));
    }
}

class desafio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor");
        double numero = entrada.nextDouble();

        System.out.println("Digite o valor");
        double numero2 = entrada.nextDouble();

        System.out.println("a soma é " + (numero + numero2));
        System.out.println("a subtração é " + (numero - numero2));
        System.out.println("a multiplicação é " + (numero * numero2));
        System.out.println("a divisão é " + (numero / numero2));
    }
}

class desafio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor");
        double C = entrada.nextDouble();

        double F = C * 1.8 + 32, K = C + 273.15, Re = C * 0.8, Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Celsius em Fahrenheit é " + F);
        System.out.println("Celsius em Kelvin é " + K);
        System.out.println("Celsius em Réaumur é " + Re);
        System.out.println("Celsius em Rankine é " + Ra);

    }
}

class cavalo {
    public static void main(String[] args) {
        Scanner massa = new Scanner(System.in);
        System.out.println("escreva um número de KG");
        double m = massa.nextDouble();

        System.out.println("escreva uma altura");
        double h = massa.nextDouble();

        System.out.println("escreva um tempo");
        double t = massa.nextDouble();

        double cavalos = (m * h / t) / 745.6999;

        System.out.println("levaria " + cavalos + " cavalos para levantar essa massa");
    }
}
