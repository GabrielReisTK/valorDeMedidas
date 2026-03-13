import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("\n--- Unidade de medidas ---");
            System.out.println("1- converter em Km/h");
            System.out.println("2- converter em cm");

            String opcao = sc.next();
            double valores;
            double resultado;

            switch (opcao){
                case "1":
                    System.out.println("Digite o valor que quer converter de metros para km/h");
                    valores = sc.nextDouble();
                    resultado = valores / 1000;
                    System.out.println("O resultado foi " + resultado + "km/h");
                    break;
                case "2":
                    System.out.println("Digite o valor que quer converter de metros para cm");
                    valores = sc.nextDouble();
                    resultado = valores * 100;
                    System.out.println("O resultado foi " + resultado + "cm");
                    break;
                default:
                    System.out.println("Valores inválidos, tente novamente");
            }

        }
    }
}
