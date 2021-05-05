package com.julia.dioaulas.com.julia.dioaulas.collections.collectionsestreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class aula1 {
     /*                          -----------------------------------------------------
                                              INTRODUÇÃO A COOLLECTIONS
                                -----------------------------------------------------             
            Neste curso, será abordado as funcionalidades básicas e quais são suas aplicabilidades em software de produção.
    Tais como, as intefaces LIST, QUEUE, SET e MAP, e também conhecer as STREAMS, COMPARATORS E OPTIONS que são as funci-
    onalidades novas trazidas no JDK 8, com a possibilidade de usar programação funcional pra manipular string de dados.
                                -----------------------------------------------------
                                    IDENTIFICANDO AS INTERFACES DA COLLECTIONS
                                -----------------------------------------------------
        OBJETIVOS DA AULA: 
            Entender o uso da interface java.util.List;
            Entender o uso da interface java.util.Queue;
            Entender o uso da interface java.util.Set;
            Entender o uso da interface java.util.Map.

        REQUISITOS BÁSICOS:
            Java Development JDK 1.8 ou Superior;
            Gradle;
            Intellij Idea IDE.

        INTRODUÇÃO
            Arrays: são funcionalidades nativas, que nos permite que uma variavél tenha maias de uma posição onde a 
    pode ser colocado mais de um valor. Chamado de conjunto de dados ou estrutura de dados;
            Java Collections API: foi implementada em cima da API de arrays, pra resolver uma série de problemas inf-
    rentados ao trabalhar diretamente com a arrays. O primeiro e grande problema é que os arrays são estáticos, ou 
    seja, uma vez criado você não pode adicionar ou remover de forma dinâmica posições e valores dentro do seu arrays.
    Então a Java Collections API veio facilidar com uma série de funcionalidades de alto nível o que seria manipulado
    manualmente nos arrays nativos do java;
            java.util.Collections: é a interface principal da Java Util Collections, através dela temos as funcionali
    dades básicas dos arrays e também outras funcionalidades quw serão vista mais à frente. A Java Util Collections é 
    estendida por outras interfaces citadas nos objetivos da aulas, e também de outras implemetações de outras inter-
    faces que não serão focadas agora, o importante é entender o básico do funcionamento Java Util Collections.
                                -----------------------------------------------------
                                        O QUE É LIST E COMO TRABALHAR COM ELA
                                -----------------------------------------------------  
        JAVA.UTIL.LIST
            A java.util.List possui váriass implementações, mas vamos focar na: 
                java.util.ArrayList (que é a mais conhecida e mais utilizada da API de Collections);
                java.util.Vector.
            A principal característica da java.util.Listé que ela garante a ordem da inserção. Ela basicamente tem a mes-
    ma funcionalidade que os arrays, só que de uma forma dinâmica, ou seja, se voce quiser adicionar ou remover indices 
    voce consegue fazer isso sem a necessidade de estar manipulando várias operações de criação, remoção e destruição de
    arrays na sua memória. Que pe exatamente o que voce faria se estivesse trabalhando com os arrays estáticos.
            Além disso, ela perimite a adição, atualização, leitura e remoção  de maneira simples sem regras complexas. O 
    que a diferencia de outras interfaces que iremos conhecer ao longo do curso. E a java.util.List também permite a pos-
    sibilidade de modificar a ordem da lista através de comparetors.          
     */
    

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // Para ADICIONAR algo na lista utilize o método ".add()".
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        // Para ORDENAR a lista em ordem alfabética basta usar o método abaixo "Collections.sort()".
        Collections.sort(nomes);
        System.out.println(nomes);

        /* O próxmo é um método de ATUALIZAÇÃO, onde é possível substituir um nome pelo o outro. Este é o método recebe 
        um index e um elemnto, isso que dizer que a atualização será dada na posição que a pessoa argumentar com o valor
        que ela argumentar,respectivamente. Este é o método ".set()".
                            ATENÇÃO: Como é um Arrays o número inical da posicão É 0 NÃO 1.*/
        nomes.set(3, "Larissa");
        System.out.println(nomes);

        /* Para REMOVER um item na lista existe duas fomas: o método ".remove(index)" que remove a posição dada e 
        ".remove(Object o)" que remove o objeto dado.*/
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("João");
        System.out.println(nomes);

        /* Para RETORNAR um item na lista basta usar o método ".get()". Que utiliza de um int e index.
        Caso a posição inserida não exista na lista, ocorrerá o erro "IndexOutOfBoundsException". */
        String nome = nomes.get(1);
        System.out.println(nomes);
         
        // Para DESCOBRIR o tamanho da lista basta usar o métoso ".size()".
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Para DESCOBRIR se há um elemnto na lista basta usar o métoso ".contains()".
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        /* Para DESCOBRIR a posição de um item na lista basta usar o método ".indexOf()".
        Caso o elemnto inserida não exista na lista, o método irá retornar o número -1. */
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        /* Existem vários outros métodos, mas agora vamos focar em como navegar com esses métodos, ou seja, passar em cada um dos
        elementos e executar em um código.*/
        // O For é um inperativa e a forma mais padrão possivél para navegar dentro das listas, porém existem mais formas.
        for (String nomeDoItem: nomes){
            System.out.println(nomeDoItem);
        }

        // Outra forma também inperativa é o Interator, e ele pode navegar através de um while.
        Iterator<String> interator = nomes.iterator();
        
        // O primeiro interator é o ".hasNext()", que retorna um booleano true sempre que interar mais um elemneto na lista.
        while (interator.hasNext()){

            // E o interator é o ".next()", retorna o elemento que você estiver interando naquele momento.
            System.out.println(interator.next());
        }

        // Para DESCOBRIR se a lista está vazia basta usar o métoso ".isEmpty()", que não recebe nenhum elemento.
        boolean listaEstaVasia = nome.isEmpty();
        System.out.println(listaEstaVasia);

        // Para LIMPAR a lista basta usar o método ".clear()".
        nomes.clear();
        
        //-------------------------------------------------------------------------------------------------------------------------------------
      
        List<String> esportes = new Vector<>();

        // ADICIONA 4 es´prtes no vetor.
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        // ALTERA o valor da posiçaõ 2 do vetor.
        esportes.set(2, "Ping Pong");

        // REMOVE o esporte da posição 2.
        esportes.remove(2);

        // REMOVE o esporte Handebol.
        esportes.remove("Handebol");

        // RETORNA o primeiro item do vetor.
        System.out.println(esportes.get(0));

        // Navegar nos esportes.
        for (String esporte: esportes){
            System.out.println(esporte);
        }

        /*
                                -----------------------------------------------------
                                                EXERCÍCIOS PARA FIXAÇÃO
                                -----------------------------------------------------  
        */

        List<String> exercicio = new ArrayList<>();{
        
            // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
            System.out.println("-------------------------");
            exercicio.add("Juliana");
            exercicio.add("Pedro");
            exercicio.add("Carlos");
            exercicio.add("Larissa");
            exercicio.add("João");

            // Navegue na lista exibindo cada nome no console.
            for (String exemplo: exercicio){
                System.out.println(exemplo);
            }

            // Substitua o nome Carlos por ROberto.
            exercicio.set(2, "Roberto");

            // Retorne a o nome da posição 1.
            String retorne = exercicio.get(1);
            System.out.println(retorne);

            // Remova o nome da posição 4.
            exercicio.remove(4);

            // Remova o nome João.
            exercicio.remove("João");

            // Retorne a quantidade de itens na lista.
            int quanti = exercicio.size();
            System.out.println(quanti);

            // Verifique se o nome Juliano existe na lista.
            boolean temJuh = exercicio.contains("Juliano");
            System.out.println(temJuh);
        }
    
        // Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira.
        List<String> newList = new ArrayList<>();{
            System.out.println("-------------------------");
            newList.add("Ismael");
            newList.add("Rodrigo");
            newList.addAll(exercicio);
            System.out.println(newList);

            // Ordene os itens da lista por ordem alfabética.
            Collections.sort(newList);
            System.out.println(newList);

            // Verifique se a lista está vazia.
            boolean listaVasia = newList.isEmpty();
        System.out.println(listaVasia);
        }
    }
}
