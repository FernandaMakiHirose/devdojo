package fernanda.maki.hirose.aula40;

public class Aula40Main {

    public static void main(String[] args) {

        Aula40.teste = "teste alunos";

        Aula40 aluno1 = new Aula40("123456", "Fernanda", new double[]{5, 7, 9}, "01/01/2022");
        Aula40 aluno2 = new Aula40("123456", "Maki", new double[]{5, 7, 9}, "01/01/2022");

        aluno1.imprime();
        System.out.println("-------------------");
        aluno2.imprime();

    }

}
