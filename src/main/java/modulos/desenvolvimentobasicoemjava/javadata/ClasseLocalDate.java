package modulos.desenvolvimentobasicoemjava.javadata;

import java.time.LocalDate;

public class ClasseLocalDate {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);
    }
}
