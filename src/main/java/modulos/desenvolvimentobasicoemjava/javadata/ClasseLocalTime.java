package modulos.desenvolvimentobasicoemjava.javadata;

import java.time.LocalTime;

public class ClasseLocalTime {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime maisUmHora = agora.plusHours(1);
        System.out.println(maisUmHora);
    }
}
