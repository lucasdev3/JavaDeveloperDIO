package modulos.collectionsestreams.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        // Recupera um estudante no índice 2;
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);
        System.out.println(estudantes.size());

        // Nageva nos registros do mapa
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : estudantes.keySet()) {
            System.out.println(key + " --- " + estudantes.get(key));
        }
    }

}
