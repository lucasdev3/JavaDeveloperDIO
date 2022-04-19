package modulos.collectionsestreams.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Amanda");
        nomes.add("Juliana");
        nomes.add("Andressa");

//        System.out.println(nomes);
//
//        Collections.sort(nomes);
//
//        System.out.println(nomes);
//
//        nomes.set(2, "Juliana Leiro");
//
//        System.out.println(nomes);
//
//        nomes.remove(3);
//
//        System.out.println(nomes);
//
//        nomes.remove("Andressa");
//
//        System.out.println(nomes);
//
//        System.out.println(nomes.get(0));
//
//        System.out.println(nomes.size());
//
//        System.out.println(nomes.contains("Anderson"));
//
//        nomes.clear();
//
//        System.out.println(nomes.isEmpty());

        for(String nome: nomes) {
            System.out.println("--> " + nome);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()) {
            System.out.println("------> " + iterator.next());
        }

    }
}
