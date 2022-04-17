package modulos.desenvolvimentobasicoemjava.exceptions;

public class Exemplo1 {

    public static void main(String[] args) {

        try {
            new java.io.FileInputStream("arquivo.txt");
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException("Não foi possivel abrir o arquivo para leitura");
        }
    }
}
