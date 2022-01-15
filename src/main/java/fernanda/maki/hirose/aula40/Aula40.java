package fernanda.maki.hirose.aula40;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Aula40 {

    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    public static String teste = "teste";

    public Aula40(String matricula, String nome, double[] notas, String dataMatricula) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.notas);
        System.out.println(this.dataMatricula);
        System.out.println(teste);
    }
}
