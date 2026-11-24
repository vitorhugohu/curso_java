package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 14;
        String cateoria;

        if(idade < 15) {
            cateoria = "Categoria infantil";
        } else if(idade >= 15 && idade < 18) {
            cateoria = "Categoria juvenil";
        } else {
            cateoria = "Categoria adulto";
        }

        // categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categoria adulto";

        System.out.println(cateoria);
    }
}
