package introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
    public static void main(String[] args) {
        int valorMax = 50;
        for(int i = 0; i <= valorMax; i++) {
            if(i > 25) {
                break; // interrompe a iteração e faz a saída forçada do laço (só pode ser usado dentro de um switch ou uma estrutura de repetição)
            }
            System.out.println(i);
        }
    }
}
