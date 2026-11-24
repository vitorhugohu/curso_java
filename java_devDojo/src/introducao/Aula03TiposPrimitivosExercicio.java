package introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Vitor";
        String endereco = "Rua Santa Carlos, 90";
        double salario = 2.500;
        String dataRecebimentoSalario = "24/11/2026";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
