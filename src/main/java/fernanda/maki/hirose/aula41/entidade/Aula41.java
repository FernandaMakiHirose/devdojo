package fernanda.maki.hirose.aula41.entidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Aula41 {

    private int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização:");
        for (int i=1; i<=100; i++) {
            parcelas[i-1] = i;
        }
    }

}
