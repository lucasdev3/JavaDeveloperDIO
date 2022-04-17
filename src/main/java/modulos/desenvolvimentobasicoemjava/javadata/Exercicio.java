package modulos.desenvolvimentobasicoemjava.javadata;

import java.time.LocalDateTime;

public class Exercicio {

    public static void main(String[] args) {
        // Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00
        LocalDateTime data = LocalDateTime.parse("2010-05-15T10:00");
        System.out.println(data);

        LocalDateTime dataFutura = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(dataFutura);

    }
}
