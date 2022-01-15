package fernanda.maki.hirose.aula39;

import fernanda.maki.hirose.aula39.entidade.Aula39;

public class Aula39Main {

    public static void main(String[] args) {

        Aula39 funcionario1 = new Aula39("Fernanda", "98765321", 1000.0, "123456789");
        Aula39 funcionario2 = new Aula39();

        funcionario1.imprime();
        funcionario2.imprime();

    }

}
