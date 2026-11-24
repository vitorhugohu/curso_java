package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos - tipos que vão guardar em memoria um valor simples (escritos com letras minúsculas)
        // int, double, float, char, byte, short, long e boolean
        int idade = 10; // variável é um espaço reservado na memória do computador para armazenar um valor
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0; // o Cast força o intrepetador converter um tipo maior em um outro tipo menor na variável, ao lado estou convertendo o double para um float. (tipoQueQueroConverter)
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";
        var nome2 = "Vegeta"; // apartir do Java10, omitir o tipo da variável

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi meu nom é " + nome);
    }
}
