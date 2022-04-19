package modulos.desenvolvimentobasicoemjava.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Teste {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        //escreva o seu código
        int salary = valor1 * valor2;

        System.out.println("SALARY = U$ " +  salary);
    }
}
