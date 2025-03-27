import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /*
        ArrayList<String> Lista = new ArrayList<>();
        Lista.add("Ana");
        Lista.add("Beatriz");
        Lista.add("Caetano");
        Lista.add("Débora");
        Lista.add("Evaristo");
        System.out.println("Imprimindo os itens do array de nomes...");

        ---Loop foreach---
        for (String nome : Lista) {
            System.out.println(nome + ", ");
        }
        */

        /*
        Animal animal = new Cachorro();
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro.");
        }
        */

        /*
        Produto p1 = new Produto("Café", 17.89, 1);
        Produto p2 = new Produto("Pão de queijo", 17.9, 2);
        Produto p3 = new Produto("Pamonha", 21.9, 2);
        Produto p4 = new Produto("Açúcar", 4.99, 1);
        Produto p5 = new Produto("Leite", 6, 2);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(p4);
        listaDeProdutos.add(p5);
        System.out.println("O preço médio dos produtos é: ");

        double somaDosPrecos = 0;
        for(Produto produto : listaDeProdutos) {
            somaDosPrecos += produto.getPreco();
        }

        double precoMedio = somaDosPrecos / listaDeProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
        */

        /*
        Circulo c1 = new Circulo();
        c1.r = 5;

        Quadrado q1 = new Quadrado();
        q1.l = 3;

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(c1);
        listaFormas.add(q1);

        for(Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
        */

        /*
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(1002025001);
        c1.setSaldo(2500);

        ContaBancaria c2 = new ContaBancaria();
        c2.setNumeroConta(1002025002);
        c2.setSaldo(8700);

        ContaBancaria c3 = new ContaBancaria();
        c3.setNumeroConta(1002025003);
        c3.setSaldo(750);

        ContaBancaria c4 = new ContaBancaria();
        c4.setNumeroConta(1002025004);
        c4.setSaldo(1000);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(c1);
        listaDeContas.add(c2);
        listaDeContas.add(c3);
        listaDeContas.add(c4);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for(ContaBancaria conta : listaDeContas) {
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("A conta com maior saldo é a: " + contaMaiorSaldo.getNumeroConta() + ", com: " + contaMaiorSaldo.getSaldo());
         */
        /*
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(4);
        inteiros.add(5);
        inteiros.add(7);
        Collections.sort(inteiros);
        System.out.println("Lista ordenada: " + inteiros);
         */
        /*
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(new Titulo("D"));
        listaDeTitulos.add(new Titulo("B"));
        listaDeTitulos.add(new Titulo("A"));

        Collections.sort(listaDeTitulos);

        for (Titulo titulo : listaDeTitulos) {
            System.out.println(titulo.nome);
        }
        */
        /*
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);
        */
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
