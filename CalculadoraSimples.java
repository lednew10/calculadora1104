import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, total = 0, op;

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\t\t\t -- Calculadora Simples --\n");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Sair");

        System.out.print("Opção: ");
        op = entrada.nextInt();

        if(op == 1){
            System.out.println("Soma Simples: ");
            System.out.print("Informe N1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe N2: ");
            n2 = entrada.nextInt();

            total = n1 + n2;

            System.out.println(n1 + " + " + n2 + " = " + total);
        } 
        else if(op == 2){
            System.out.println("Subtração Simples:");
            System.out.print("Informe N1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe N2: ");
            n2 = entrada.nextInt();

            total = n1 - n2;

            System.out.println(n1 + " - " + n2 + " = " + total);
        } 
        else if(op == 3){
            System.out.println("Encerrando a calculadora... Forte abraço!");
        } 
        else {
            System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}




                              

