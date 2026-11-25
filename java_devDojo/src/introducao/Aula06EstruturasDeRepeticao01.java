package introducao;

/*
    While - usando quando eu não sei até quando irei fazer uma determinada demanda, pode ser executado ou não (Trabalha com condições)
    Do While - usando quando eu não sei até quando irei fazer uma determinada demanda, vai executar pelo menos uma vez (Trabalha com condições)
    For - usando quando sei até quando irei fazer uma determinada demanda(Trabalha com índices)
*/

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            System.out.println(++count);
        }

        count = 0;

        do {
            System.out.println("dentro do do-while " + ++count);
        } while(count < 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
