package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // O operador ternário sempre vai associar o valor diretamente para uma variável. Ele deve ser utilizado em situções que tenho um if e else simples
        // (condicao) ? verdadeiro : falso;
        // o tipo do veradeiro ou falso precisa ser igual da variavel que armazena o operador ternário
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
