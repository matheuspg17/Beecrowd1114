
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senha, controle = 1;

        for (int i = 0; i < controle; i++) {
            senha = leia.nextInt();
            switch (senha) {
                case 2002:
                    System.out.println("Acesso Permitido");
                    controle = 0;
                    break;
                default:
                    System.out.println("Senha Invalida");
                    controle++;
                    break;
            }
        }
    }
}
