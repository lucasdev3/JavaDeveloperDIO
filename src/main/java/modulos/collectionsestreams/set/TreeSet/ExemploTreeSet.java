package modulos.collectionsestreams.set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        /*
        * Quando é necessário alterar a ordem através do uso de comparators.
        * Mantém a ordem e pode ser reoordenado
        * É performatico para leitura. Para modificação tem a necessidade de reorndenar sendo mais lento que o LinkedHashSet
        * */

        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curutiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna a última capital no fianl da árvore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        // Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        for (String capital: treeCapitais) {
            System.out.println("----> " + capital);
        }


    }
}
