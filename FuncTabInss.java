import java.util.ArrayList;
import java.util.Scanner;

public class FuncTabInss {

    public static double calcularInss(double salario) {
        double impostoInss = 0;
        if (salario <= 1302) {
            impostoInss = salario * 0.075;
        } else if (salario > 1032.01 || salario <= 2571.29) {
            impostoInss = salario * 0.09 - 19.53;
        } else if (salario > 2571.30 || salario <= 3856.94) {
            impostoInss = salario * 0.12 - 96.67;
        } else if (salario >3856.95 || salario <= 7507.49) {
            impostoInss = salario * 0.14 - 173.80;
        }

        return impostoInss;
    }

    public static double impostoDeRenda(double result) {
        double impostoRenda = 0;
        if (result <= 1903.98) {
            impostoRenda = result;
        } else if (result > 1904 || result <= 2826.65) {
            impostoRenda = result * 0.075 - 142.80;
        } else if (result > 2826.66 || result <= 3751.05) {
            impostoRenda = result * 0.15 - 354.80;
        } else if (result > 3571.06 || result <= 4664.68) {
            impostoRenda = result * 0.225 - 636.13;
        } else if (result > 4664.69) {
            impostoRenda = result * 0.275 - 869.36;
        }

        return impostoRenda;
    }

    public static String[] nomeMeses() {
        String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        return mes;
    }

    public static String informacoes(String nome, String cpf, String email, String dataNascimento, String telefone) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para começarmos, digite seu nome completo: ");
        nome = sc.nextLine();
        System.out.println("Agora seu CPF: ");
        cpf = sc.nextLine();
        System.out.println("Seu email, por favor: ");
        email = sc.nextLine();
        System.out.println("Sua data de nascimento: ");
        dataNascimento = sc.nextLine();
        System.out.println("Por fim, se telefone: ");
        telefone = sc.nextLine();

        return "Muito obrigado pela confiança " + nome;
    }
}
