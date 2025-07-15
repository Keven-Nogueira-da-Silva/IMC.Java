import java.util.Scanner;
public class Import_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc = -1;

        while(true){
            System.out.println("Escolha uma opção: ");
            System.out.println("""
                    1 - Calcular IMC
                    2 - Saber a classificação do IMC
                    0 - Sair""");

            int opcao = sc.nextInt();

            if (opcao == 0){
                System.out.println("Saindo...");
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println("Qual é o seu peso: ");
                    double peso = sc.nextDouble();
                    System.out.println("Qual é a sua altura");
                    double altura = sc.nextDouble();
                    System.out.println();

                    imc = peso / (altura * altura);
                    System.out.printf("Seu IMC é: %.2f%n", imc);
                    break;

                case 2:
                    if (imc < 18.5){
                        System.out.println("Apaixo do peso");

                    }else if (imc < 25){
                        System.out.println("Peso normal");

                    }else if (imc < 30.0){
                        System.out.println("Sobrepeso");

                    }else if (imc < 35){
                        System.out.println("Obesidade grau I");

                    }else if (imc < 40){
                        System.out.println("Obesidade grau II");
                    }
                    break;

                default:
                    System.out.println("opção invalida");

            }
        }
        sc.close();
    }
}
