class quickstart {
    public static void main(String[] args) {

        double C = 38.0;
        double F = C * 1.8 + 32;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.println("a temperatura em Fahenrite é" + (C + F));
        System.out.println("a temperatura em Kelvin é " + (C + K));
        System.out.println("a temperatura em Re é " + (C + Re));
        System.out.println("a temperatura em Ra é " + (C + Ra));
    }

}