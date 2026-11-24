package introducao;

/*
    Operadores são elementos no Java que
    vai permitir realizar operações
*/

public class Aula04Operadores {
    public static void main(String[] args) {
        // + = / *
        // o resultado de uma operação de 2 numeros inteiros sempre é um número inteiro
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // % 
        int resto = 21 % 2;
        System.out.println(resto);

        // < >  <=  >=  ==  !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3.500F;
        boolean isDentroDaLei = idade >= 30 && salario >= 4.612; 
        boolean isDentroDaLeiMenorQueTrina = idade < 30 && salario >= 3.381;

        System.out.println("isDentroDaLei " + isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrina " + isDentroDaLeiMenorQueTrina);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // =  +=  -=  *=  /=  %=   (atribuir um valor a minha variável)
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ -- 
        int contador = 0;
        contador += 1;
        contador++; // contador + 1.
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); // primeiro faz a impresao do valor do contador2 depois incrementa 1
        System.out.println(++contador2); // primeiro incrementa 1 depois faz a impresao do valor do contador2 
    }
}
