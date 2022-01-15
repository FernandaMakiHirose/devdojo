package fernanda.maki.hirose.aula41;

import fernanda.maki.hirose.aula41.entidade.Aula41;

public class Aula41Main {

    public static void main(String[] args) {

        Aula41 aula41 = new Aula41();
        System.out.println("Exibindo a quantidade de parcelas possíveis:");
        for (int parcela : aula41.getParcelas()) {
            System.out.print(parcela + " ");
        }

    }

}
