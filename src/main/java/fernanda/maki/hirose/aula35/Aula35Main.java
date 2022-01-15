package fernanda.maki.hirose.aula35;

import fernanda.maki.hirose.aula35.entidade.Aula35;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula35Main {

    public static void main(String[] args) {

        Aula35 calculoMedia = new Aula35();

        calculoMedia.setNome("Fernanda");
        calculoMedia.setIdade(-1);
        calculoMedia.setNotas(new double[]{3, 2, 9.5});
        calculoMedia.print();
        calculoMedia.tirarMedia();
        System.out.println("Aprovado? " + calculoMedia.isAprovado());

    }

}

