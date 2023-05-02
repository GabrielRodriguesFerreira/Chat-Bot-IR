import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FuncTabInss fti = new FuncTabInss();
        Scanner sc = new Scanner(System.in);
        String nome = "", cpf = "", email = "", dataDeNascimento = "", telefone = "";
        String informacoes = fti.informacoes(nome, cpf, email, dataDeNascimento, telefone);
        double salarioBruto, salarioLimpo = 0, salarioDesc = 0, inssAnual = 0, irAnual = 0;
        String[] meses = FuncTabInss.nomeMeses();

        System.out.println(informacoes);

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Digite o seu salario bruto do mês " + meses[i] + " :");
                salarioBruto = sc.nextDouble();
                double impostoInss = FuncTabInss.calcularInss(salarioBruto);
                System.out.printf("Valor de INSS: R$%.2f " + "\n", impostoInss);
                    salarioLimpo = salarioBruto - impostoInss;
                    inssAnual += impostoInss;
                    System.out.printf("Valor para calculo IR (imposto de Renda): R$%.2f" + "\n", salarioLimpo);
                    double impostoIR = FuncTabInss.impostoDeRenda(salarioLimpo);
                        System.out.printf("Valor de IR: R$%.2f" + "\n", impostoIR);
                        irAnual += impostoIR;
                        salarioDesc = salarioLimpo - impostoIR;
                            System.out.printf("Seu salário com os descontos de IR: R$%.2f" + "\n", salarioDesc);
        }
        System.out.printf("Valor INSS anual: R$%.2f" + "\n", inssAnual);
        System.out.printf("Valor IR (Imposto de Renda) anual: R$%.2f" + "\n", irAnual);
    }
}
