import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float resultado = 0;
        float n1 = 0, n2 = 0;
        int cont = 0;
        boolean exit = true;
        do {
            System.out.print("Ingrese el primer numero: ");
            n1 = sc.nextFloat();
            System.out.print("Ingrese el segundo numero: ");
            n2 = sc.nextFloat();
            System.out.println("Que desea realizar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    resultado = sumar(n1, n2);
                    break;
                case 2:
                    resultado = restar(n1, n2);
                    break;
                case 3:
                    resultado = multiplicar(n1, n2);
                    break;
                case 4:
                    resultado = dividir(n1, n2);
                    break;
                default:
                    System.out.println("Saliendo...");
                    exit = false;
                    break;
            }
            System.out.println("Resultado: " + resultado);

        }while(exit);
        System.out.println("Fin del programa...");
    }

    public static float sumar(float n1, float n2){
        return n1+n2;
    }
    public static float restar(float n1, float n2){
        return n1-n2;
    }
    public static float multiplicar(float n1, float n2){
        return n1*n2;
    }
    public static float dividir(float n1, float n2){
        return n1/n2;
    }
}