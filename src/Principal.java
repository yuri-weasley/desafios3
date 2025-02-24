import java.util.ArrayList;

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
        System.out.println("O preço médio dos produtos é ");

    }
}
